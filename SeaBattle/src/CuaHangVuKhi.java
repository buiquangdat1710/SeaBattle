import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public class CuaHangVuKhi {
    Scanner sc = new Scanner(System.in);
    int luachon;
    public void Menu1() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("----------CỬA-HÀNG-VŨ-KHÍ-NGƯỜI-1--------");
        System.out.println("|1. Bom cơ bản.                         |");
        System.out.println("|2. Bom nguyên tử.                      |");
        System.out.println("|3. Máy bay tiêm kích + bom TNT.        |");
        System.out.println("-----------------------------------------");
        System.out.print("Lựa chọn của bạn: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void Menu2() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("----------CỬA-HÀNG-VŨ-KHÍ-NGƯỜI-2--------");
        System.out.println("|1. Bom cơ bản.                         |");
        System.out.println("|2. Bom nguyên tử.                      |");
        System.out.println("|3. Máy bay tiêm kích + bom TNT.        |");
        System.out.println("-----------------------------------------");
        System.out.print("Lựa chọn của bạn: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void bomCoBan(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("                                                         c=====e");
        System.out.println("                                                            H");
        System.out.println("   ____________                                         _,,_H__");
        System.out.println("  (__((__((___()                                       //|     |");
        System.out.println(" (__((__((___()()_____________________________________// |ACME |");
        System.out.println("(__((__((___()()()------------------------------------'  |_____|");
        System.out.println();
        System.out.println("-----------------THÔNG-TIN-CƠ-BẢN-----------------");
        System.out.println("|1. Phạm vi tấn công: Chỉ làm nổ 1 ô mà bạn chọn.|");
        System.out.println("|2. Giá tiền: 0 đồng.                            |");
        System.out.println("--------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng vũ khí, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void bomNguyenTu(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("          _ ._  _ , _ ._");
        System.out.println("        (_ ' ( `  )_  .__)");
        System.out.println("      ( (  (    )   `)  ) _)");
        System.out.println("     (__ (_   (_ . _) _) ,__)");
        System.out.println("         `~~`\\ ' . /`~~`");
        System.out.println("              ;   ;");
        System.out.println("              /   \\");
        System.out.println("_____________/_ __ \\_____________");
        System.out.println();
        System.out.println("--------------------------------THÔNG-TIN-CƠ-BẢN---------------------------");
        System.out.println("|1. Phạm vi tấn công: 5 ô gồm ô mà mình chọn và 4 ô xung quanh nó.        |");
        System.out.println("|2. Giá tiền: 30 đồng.                                                    |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng vũ khí, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void mayBay(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("                  (\\__.-. |");
        System.out.println("                  == ===_]+");
        System.out.println("                          |");
        System.out.println(" ` - .");
        System.out.println("       ` - >->");
        System.out.println("\n\n");
        System.out.println("                __/___");
        System.out.println("          _____/______|");
        System.out.println("  _______/_____\\_______\\_____");
        System.out.println("  \\              < < <       | ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("--------------------------------THÔNG-TIN-CƠ-BẢN---------------------------");
        System.out.println("|1. Phạm vi tấn công: 1 hàng và 1 cột của cả bản đồ.                      |");
        System.out.println("|2. Giá tiền: 60 đồng.                                                    |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng vũ khí, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
}
