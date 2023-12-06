import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public class CuaHangSkill {
    int luachon;
    Scanner sc = new Scanner(System.in);
    public void Menu1() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("--------Kĩ-NĂNG-ĐẶC-BIỆT-NGƯỜI-1-----");
        System.out.println("|1. Đặt Cọc.                        |");
        System.out.println("|2. Ống Nhòm.                       |");
        System.out.println("|3. Bành Trướng Lãnh Địa.           |");
        System.out.println("-------------------------------------");
        System.out.print("Lựa chọn của bạn: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void Menu2() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("-------Kĩ-NĂNG-ĐẶC-BIỆT-NGƯỜI-2------");
        System.out.println("|1. Đặt Cọc.                        |");
        System.out.println("|2. Ống Nhòm.                       |");
        System.out.println("|3. Bành Trướng Lãnh Địa.           |");
        System.out.println("-------------------------------------");
        System.out.print("Lựa chọn của bạn: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void datCoc(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("       /\\");
        System.out.println("      //\\\\");
        System.out.println("     //  \\\\");
        System.out.println(" ^   \\\\  //   ^");
        System.out.println("/ \\   )  (   / \\");
        System.out.println(") (   )  (   ) (");
        System.out.println("\\  \\_/ /\\ \\_/  /");
        System.out.println(" \\__  _)(_  __/");
        System.out.println("    \\ \\  / /");
        System.out.println("     ) \\/ (");
        System.out.println("     | /\\ |");
        System.out.println("     | )( |");
        System.out.println("     | )( |");
        System.out.println("     | \\/ |");
        System.out.println("     )____(");
        System.out.println("    /      \\");
        System.out.println("    \\______/");
        System.out.println();
        System.out.println("------------------------------------------THÔNG-TIN-CƠ-BẢN----------------------------------------------");
        System.out.println("|1. Tác dụng: Sẽ đặt cọc 1 ô và nếu như đối thủ bắn trúng ô đó thì đối thủ sẽ bị mất 1 ô có thuyền.    |");
        System.out.println("|2. Giá tiền: 10 đồng.                                                                                 |");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng kĩ năng, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void ongNhom(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣄⠀⠀⠀⠀⠀⠀⣠⣄");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠚⠻⠿⡇⠀⠀⠀⠀⢸⠿⠟⠓⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣶⣦⡀⢀⣤⣤⡀⢀⣴⣶⣿⣷⣦⣄");
        System.out.println("⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣦");
        System.out.println("⠀⠀⠀⠀⠘⠋⣉⡉⠙⠛⢿⣿⡇⢸⣿⣿⡇⢸⣿⡿⠛⠋⢉⣉⠙⠃");
        System.out.println("⠀⠀⢀⣤⣾⡛⠛⠛⠻⢷⣤⡙⠃⢸⣿⣿⡇⠘⢋⣤⣾⡟⠛⠛⠛⠷⣤⡀⠀⠀");
        System.out.println("⠀⢀⣾⣿⣿⡇⠀⠀⠀⠀⠙⣷⠀⠘⠛⠛⠃⠀⣾⣿⣿⣿⠀⠀⠀⠀⠈⢷⡀⠀");
        System.out.println("⢸⡇⠈⠉⠀⠀⠀⠀⠀⠀⢸⡆⢰⣿⣿⡆⢰⡇⠀⠉⠁⠀⠀⠀⠀⠀⢸⡇⠀");
        System.out.println("⠸⣧⠀⠀⠀⠀⠀⠀⠀⢀⡾⠀⠀⠉⠉⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⣼⠇⠀");
        System.out.println("⠀⠀⠙⢷⣄⣀⠀⠀⣀⣤⡾⠁⠀⠀⠀⠀⠀⠀⠈⢷⣤⣀⠀⠀⣀⣠⡾⠋");
        System.out.println("⠀⠀⠀⠀⠉⠛⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠛⠉⠀⠀⠀");
        System.out.println();
        System.out.println("---------------THÔNG-TIN-CƠ-BẢN-----------------");
        System.out.println("|1. Tác dụng: Nhìn được bản đồ của đối thủ.    |");
        System.out.println("|2. Giá tiền: 40 đồng.                         |");
        System.out.println("------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng kĩ năng, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
    public void banhTruongLanhDia(NguoiChoi nguoiChoi) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sound sound = new Sound();
        sound.Expansion();
        String tmp = "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡿⠁⣿⣿⣿⠋⣰⣿⡿⠁⣾⣿⣿⡿⠃⢸⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡻⣿⣿⣿⣿⣿⡿⢃⣿⣿⠃⢰⡿⢻⠁⢀⡿⠋⠀⡰⣿⣿⠟⠁⠀⣾⣿⠿⣟⣿⡿⠋⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⣿⣿⣿⠟⡟⠁⢸⠏⡈⠀⠸⠁⠇⠀⠸⠀⠀⠐⣰⠟⠁⠀⠀⡸⠋⣰⣾⡿⠋⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⡇⠀⣿⠏⢡⠎⠀⢀⡆⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠀⠘⠋⠁⠀⠀⣠⣿⢟⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⢻⣻⠇⢇⢸⠃⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠊⣉⢴⣽⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⢿⠀⠀⠀⠀⠀⠀⢠⠂⠀⠀⠀⠀⠀⠀⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠔⠛⠉⠉⢉⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠘⠀⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⠻⣟⢹⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⢠⢃⠀⠀⠀⠀⠀⠀⡀⠀⠀⣀⡠⠄⠀⠀⠀⠀⠀⠐⠊⠉⠙⠓⠛⣉⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌⠙⠣⠀⡀⠀⠀⠀⢸⠀⢸⠀⠀⠀⠀⢠⠊⢀⠋⣸⢠⠃⠀⢀⠔⠋⡠⣶⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠓⢄⡀⢇⠀⠀⠀⠸⡀⠸⡀⠀⠀⠰⠁⡠⠃⣠⡷⠁⢀⢔⠁⢀⡔⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠚⠉⠉⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⡿⢿⣈⣦⠀⠀⠘⣄⠀⠀⠀⢳⡀⠷⣀⣀⠿⠴⢥⣾⡯⠥⠤⠧⠤⠤⠮⠤⡤⢤⠤⡄⣀⣀⣴⡶⠂⠀⠀⠀⠀⣶⣶⣺⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣉⡁⠀⠀⠫⡦⣠⣀⡤⠟⠊⠹⠒⠊⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠓⠂⠀⠉⠣⣖⣦⣄⡀⠈⣡⣤⣤⣤⣭⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣟⣛⠃⠀⠀⠀⠀⣽⣿⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⣼⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣿⠛⠁⢀⣠⣤⡀⠀⠀⠀⠀⣤⣤⡶⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⢤⣼⣎⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡼⠿⢿⣿⣿⣦⡀⠀⢼⠿⠃⣀⣤⠤⠄⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⡿⢾⡿⠊⣱⣦⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣇⠀⠀⠉⠉⠙⠻⣏⣦⡀⣀⡘⠛⠂⠀⠀⠀⠀⠀⠀⣀⠴⠊⠉⠀⠀⢃⡞⢁⣴⡻⠬⠹⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⡄⠀⠀⠀⠀⢠⣿⣍⣋⣉⡀⠀⠀⠀⠀⣀⡠⠴⠊⠁⠀⠀⠀⠀⠀⡸⠀⠘⡇⢱⠀⢀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⠀⠀⠀⢀⡸⠁⠀⠀⠈⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣔⣁⠜⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣆⣀⡠⠚⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⠀⠀⠈⠳⣤⡄⠈⠁⠀⠀⠀⠀⢀⣀⣀⣰⣦⠀⠀⠀⠀⠀⠀⠀⣎⡞⠙⡏⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢵⡀⠀⠀⠀⠀⠀⣠⡤⠔⠒⢉⣁⡀⠤⣤⣦⡇⠀⠀⠀⠀⠀⠀⠀⡿⠁⡀⢩⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠷⡄⠀⠀⢰⣮⣁⣴⡲⡽⣋⣀⣀⣿⣟⣛⠃⠀⠀⠀⠀⠀⠀⡠⢃⣴⠁⠸⣿⣿⣿⣿⣿⣽⣿⡿⠿⠽⠟⠛⠻⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠈⢢⡀⠀⠙⣶⠤⢽⡿⠛⠉⠉⢀⣀⠼⠲⡒⠒⠒⠂⢑⡎⠁⢸⠃⢀⣀⡹⠿⠛⠉⠉⠀⠀⠀⠀⠀⠀⡼⣸⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡇⠀⠀⡷⡄⠀⠈⢻⠻⢤⡴⣲⡚⠉⠀⠀⠀⠁⡀⣀⣰⠟⠀⣠⠗⠚⣉⣤⣶⣤⣴⣤⣴⣦⡥⠀⠀⠀⠁⡇⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠰⣿⣾⣧⣀⡠⠛⠁⠀⠈⢁⡤⣄⡶⢞⣿⠟⠉⣠⣔⣯⣵⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣄⣀⣾⣤⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢫⠃⠀⠀⢰⣿⣿⢋⡡⠀⠀⠀⣠⡴⢫⠟⣩⣶⣿⣥⣾⣟⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢻⠏⠀⠀⢛⡿⠋⠰⠋⠀⠀⢰⡿⠯⠤⠓⠛⠉⣿⠙⣆⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⠒⢿⢹⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠉⠃⠀⠂⠶⠋⠀⡰⢃⣴⠎⠀⠀⠀⠀⠀⠀⠀⣀⣽⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⣀⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠘⣱⠟⠁⣠⠴⠂⠀⠶⠖⠚⠉⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣭⣷⣶⣄⣀⣀⠀⠀⠙⠻\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣼⠀⠀⠀⠀⠀⠜⠁⢠⠆⢁⣤⠂⠀⠀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣬⣭⣴⣲\n" +
        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⣧⠀⠀⠀⠠⠆⢀⢄⡤⠞⠛⠁⣀⢤⠞⠀⠰⠊⠁⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⣿⡿⠛⣏⠄⠀⣀⣤⣴⣿⠀⠀⠀⠀⠀⠈⠈⠀⠀⡰⠛⠉⢀⡄⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "⣿⣿⣿⣿⣿⡟⢀⣶⣿⣿⡿⣿⣿⣿⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⢠⢆⣈⢤⣠⣺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n";
        System.out.println(tmp);
        System.out.println();
        System.out.println("------------------------------------------------THÔNG-TIN-CƠ-BẢN---------------------------------------------");
        System.out.println("|1. Tác dụng: Bắn trúng bao nhiêu thuyền đối thủ trong lượt này thì bản đồ của mình cũng cộng từng đó thuyền|");
        System.out.println("|2. Giá tiền: 60 đồng.                                                                                      |");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Số tiền của bạn hiện tại: " + nguoiChoi.tien + " đồng.");
        System.out.print("Bấm 1 để mua, bấm số khác để quay lại cửa hàng kĩ năng, lựa chọn của bạn là: ");
        luachon = sc.nextInt();
        sound.Button();
    }
}
