import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public class KhaiHoa {
    Scanner sc = new Scanner(System.in);
    public void khaiHoa(NguoiChoi nguoichoi1, NguoiChoi nguoichoi2,String loaiBom,boolean moRong) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        nguoichoi1.banDoCuaDoiThu();
            System.out.println("Nhập tọa độ bạn muốn khai hỏa: ");
            String x, y;
            int tmpx, tmpy;
            while (true) {
                x = sc.next();
                y = sc.next();
                sound.Button();
                if (Character.isLetter(x.charAt(0))) {
                    tmpx = x.charAt(0) - 55;
                } else if (Character.isDigit(x.charAt(0)) && x.length() <= 1) {
                    tmpx = x.charAt(0) - 48;
                } else {
                    System.out.println("Nhập tọa độ sai. Vui lòng nhập lại tọa độ: ");
                    continue;
                }
                if (Character.isLetter(y.charAt(0))) {
                    tmpy = y.charAt(0) - 55;
                } else if (Character.isDigit(y.charAt(0)) && y.length() <= 1) {
                    tmpy = y.charAt(0) - 48;
                } else {
                    System.out.println("Nhập tọa độ sai. Vui lòng nhập lại tọa độ: ");
                    continue;
                }
                tmpx++;
                tmpy++;
                sound.Bomb();
                slowPrint(2500, "-");
                if (!nguoichoi1.kiemTraDan(tmpx, tmpy)) {
                    System.out.println("Đạn bay ra ngoài bản đồ hoặc bạn đã bắn vị trí đó rồi. Vui lòng nhập lại tọa độ: ");
                    continue;
                }
                break;
            }
            ToaDo toaDo = new ToaDo(tmpx, tmpy);
            nguoichoi1.capNhapBanDoCuaDoiThu(nguoichoi2.BanDo, nguoichoi2.BanDoDatCoc,nguoichoi2.BanDoDoiThu,toaDo, "nguoi",loaiBom,moRong);
    }
    public static void slowPrint(int time, String toPrint){

        char[] toPrintC = toPrint.toCharArray();// Create a char array and assign that to a string converted to a char array
        for(int i = 0; i < toPrintC.length;i++){ // Create a for loop
            System.out.print(toPrintC[i]);// Print the char
            try{
                Thread.sleep(time);// Stop printing for the amount of milliseconds specified(in the variable time)
            }catch(Exception e){
                e.printStackTrace();
            }
            // We surround in try/catch because Thread.sleep throws an exception
        }
    }
}
