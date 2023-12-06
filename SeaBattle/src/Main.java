import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Main {
    // Để có trải nghiệm tốt nhất, người dùng vui lòng đeo tai nghe nếu có và để loa có âm lượng từ 70% - 80%. Nếu dùng loa ngoài thì để tầm 90% - 100%
    // Bạn có thể chỉnh sound effect của từng thứ ở class Sound hoặc nhạc nền và thời tiết ở class này
    //  NOTE: * Nếu 1 số lựa chọn trong game bị lỗi (game đang chạy tự dưng bị dừng) thì khả năng cao là lỗi do IDLE, tắt IDLE và khởi động lại chương trình.
    public static ArrayList<NguoiChoi> BXH = new ArrayList<>();
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        // Nhạc nền
        File Main_Theme = new File("Main Theme.wav");
        AudioInputStream audioStream_main = AudioSystem.getAudioInputStream(Main_Theme);
        Clip clip_main = AudioSystem.getClip();
        clip_main.open(audioStream_main);

        FloatControl volume2 = (FloatControl) clip_main.getControl(FloatControl.Type.MASTER_GAIN);
        // set the percent (between 0.0 and 1.0)
        double percent2 = 0.1;
        float dB2 = (float) (Math.log(percent2) / Math.log(10.0) * 20.0);
        volume2.setValue(dB2);
        clip_main.start();
        clip_main.loop(clip_main.LOOP_CONTINUOUSLY);
        // Thời tiết nhiều gió
        File Wind = new File("Wind Sound.wav");
        AudioInputStream audioStream_wind = AudioSystem.getAudioInputStream(Wind);
        Clip clip_wind = AudioSystem.getClip();
        clip_wind.open(audioStream_wind);

        FloatControl volume = (FloatControl) clip_wind.getControl(FloatControl.Type.MASTER_GAIN);
        // set the percent (between 0.0 and 1.0)
        double percent = 0.9;
        float dB = (float) (Math.log(percent) / Math.log(10.0) * 20.0);
        volume.setValue(dB);

        //Thời tiết giông bão
        File Rain = new File("Rain Sound.wav");
        AudioInputStream audioStream_rain = AudioSystem.getAudioInputStream(Rain);
        Clip clip_rain = AudioSystem.getClip();
        clip_rain.open(audioStream_rain);

        FloatControl volume_rain = (FloatControl) clip_rain.getControl(FloatControl.Type.MASTER_GAIN);
        // set the percent (between 0.0 and 1.0)
        double percent_rain = 0.4;
        float dB_rain = (float) (Math.log(percent_rain) / Math.log(10.0) * 20.0);
        volume_rain.setValue(dB_rain);
        // ----------------------------------------------------
        Sound sound = new Sound();
        sound.Wave();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println(ANSI_CYAN+" ______   ______   ________        _______   ________   _________  _________  __       ______      ");
        System.out.println("/_____/\\ /_____/\\ /_______/\\     /_______/\\ /_______/\\ /________/\\/________/\\/_/\\     /_____/\\     ");
        System.out.println("\\::::_\\/_\\::::_\\/_\\::: _  \\ \\    \\::: _  \\ \\\\::: _  \\ \\\\__.::.__\\/\\__.::.__\\/\\-\\ \\    \\::::_\\/_    ");
        System.out.println(" \\:\\/___/\\\\:\\/___/\\\\::(_)  \\ \\    \\::(_)  \\/_\\::(_)  \\ \\  \\::\\ \\     \\::\\ \\   \\:\\ \\    \\:\\/___/\\   ");
        System.out.println("  \\_::._\\:\\\\::___\\/_\\:: __  \\ \\    \\::  _  \\ \\\\:: __  \\ \\  \\::\\ \\     \\::\\ \\   \\:\\ \\____\\::___\\/_ ");
        System.out.println("    /____\\:\\\\:\\____/\\\\:.\\ \\  \\ \\    \\::(_)  \\ \\\\:.\\ \\  \\ \\  \\::\\ \\     \\::\\ \\   \\:\\/___/\\\\:\\____/\\ ");
        System.out.println("    \\_____\\/ \\_____\\/ \\__\\/\\__\\/     \\_______\\/ \\__\\/\\__\\/   \\__\\/      \\__\\/    \\_____\\/ \\_____\\/ ");
        System.out.println();
        while(true){
            menu.hienThiMenu();
            int choice_Menu = sc.nextInt();
            sound.Button();
            sc.nextLine();
            menu.setChoice(choice_Menu);
            if(menu.getChoice() == 1){
                // Menu 2 người chơi
                NguoiChoi nguoichoi1 = new NguoiChoi();
                NguoiChoi nguoichoi2  = new NguoiChoi();
                int choice_nguoichoi1;
                int choice_nguoichoi2;
                while(true){
                    System.out.print("Hãy nhập kích cỡ bản đồ hai người muốn chơi (kích cỡ từ 5x5 -> 20x20): ");
                    int kichCo = sc.nextInt();
                    sc.nextLine();
                    sound.Button();
                    if(kichCo >= 5 && kichCo <=20){
                        nguoichoi1.kichCoBanDo = kichCo;
                        nguoichoi2.kichCoBanDo = kichCo;
                        break;
                    }else{
                        System.out.print("Bạn nhập sai kích cỡ rồi, vui lòng nhập lại. ");
                    }
                }
                System.out.print("Nhập tên người chơi 1: ");
                nguoichoi1.tenNguoiChoi = sc.nextLine();
                sound.Button();
                System.out.print("Nhập tên người chơi 2: ");
                nguoichoi2.tenNguoiChoi = sc.nextLine();
                sound.Button();
                Menu2NguoiChoi menu2NguoiChoi = new Menu2NguoiChoi();
                menu2NguoiChoi.hoatDong();
                if(menu2NguoiChoi.getChoice() == 1){
                    // Thêm tàu Thủ Công
                    System.out.println("Bắt đầu đặt thuyền thủ công !!!");
                    while(true){
                        nguoichoi1.Menu1();
                        choice_nguoichoi1 = sc.nextInt();
                        sc.nextLine();
                        sound.Button();
                        if(choice_nguoichoi1 == 1){
                            nguoichoi1.banDoHienTai();
                        }else if(choice_nguoichoi1 == 2){
                            nguoichoi1.chonThuyen();
                        }else{
                            System.out.println("Lựa chọn của bạn ko có ở trên !");
                            System.out.println("Chương trình sẽ quay lại Menu");
                            continue;
                        }
                        if(nguoichoi1.kiemTraDanhSachRong()){
                            System.out.println("Bạn đã nhập xong hết thuyền. Chương trình sẽ chuyển sang người chơi thứ 2.");
                            break;
                        }
                    }
                    while(true){
                        nguoichoi2.Menu2();
                        choice_nguoichoi2 = sc.nextInt();
                        sc.nextLine();
                        sound.Button();
                        if(choice_nguoichoi2 == 1){
                            nguoichoi2.banDoHienTai();
                        }else if(choice_nguoichoi2 == 2){
                            nguoichoi2.chonThuyen();
                        }else{
                            System.out.println("Lựa chọn của bạn ko có ở trên !");
                            System.out.println("Chương trình sẽ quay lại Menu");
                            continue;
                        }
                        if(nguoichoi2.kiemTraDanhSachRong()){
                            System.out.println("Bạn đã nhập xong hết thuyền. Cuộc chiến sẽ xảy ra sau 10s nữa !!!");
                            break;
                        }
                    }
                }else{
                    // Đặt thuyền tự động
                    nguoichoi1.tuDongChonThuyen();
                    nguoichoi2.tuDongChonThuyen();
                    System.out.println("Đã chọn thuyền xong cho 2 người chơi !!!!");
                }
                sound.CountDown();
                System.out.println("Bắt đầu đếm ngược đồng hồ !!!!");
                sound.CountDown();
                for(int i=10;i>=1;i--){
                    slowPrint(430,i + "\n");
                }
                slowPrint(1500,"-");
                sound.Fight();
                System.out.println(" CUỘC CHIẾN BẮT ĐẦU !!!!!");
                // Giai đoạn 2: Chiến Tranh
                CuaHangVuKhi cuaHangVuKhi = new CuaHangVuKhi();
                boolean check = false;
                boolean moRong = false,moRong2 = false;
                while(true){
                    // Menu của người 1
                    while(true){
                        nguoichoi1.MenuCT1();
                        choice_nguoichoi1 = sc.nextInt();
                        sound.Button();
                        if(choice_nguoichoi1 == 1){
                            nguoichoi1.banDoHienTai();
                        }else if(choice_nguoichoi1 == 2){
                            nguoichoi1.banDoCuaDoiThu();
                        }else if(choice_nguoichoi1 == 3){
                            // Vào phần cửa hảng vũ khí của người 1
                            while(true) {
                                cuaHangVuKhi.Menu1();
                                if (cuaHangVuKhi.luachon == 1) {
                                    cuaHangVuKhi.bomCoBan(nguoichoi1);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        sound.Buy();
                                        KhaiHoa it = new KhaiHoa();
                                        it.khaiHoa(nguoichoi1, nguoichoi2, "coban",moRong);
                                    }else{
                                        continue;
                                    }
                                } else if (cuaHangVuKhi.luachon == 2) {
                                    cuaHangVuKhi.bomNguyenTu(nguoichoi1);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        if(nguoichoi1.tien >= 30){
                                            sound.Buy();
                                            KhaiHoa it = new KhaiHoa();
                                            it.khaiHoa(nguoichoi1,nguoichoi2,"nguyentu",moRong);
                                        }else{
                                            System.out.println("Bạn ko có đủ tiền để mua vũ khí này. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                            continue;
                                        }
                                    }else{
                                        continue;
                                    }
                                } else if (cuaHangVuKhi.luachon == 3) {
                                    cuaHangVuKhi.mayBay(nguoichoi1);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        if(nguoichoi1.tien >= 60){
                                            sound.Buy();
                                            KhaiHoa it = new KhaiHoa();
                                            it.khaiHoa(nguoichoi1,nguoichoi2,"maybay",moRong);
                                        }else{
                                            System.out.println("Bạn ko có đủ tiền để mua vũ khí này. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                            continue;
                                        }
                                    }else{
                                        continue;
                                    }
                                } else {
                                    System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                    continue;
                                }
                                break;
                            }
                            moRong = false;
                            break;
                        }else if(choice_nguoichoi1 == 4){
                            CuaHangSkill skill = new CuaHangSkill();
                            while(true){
                                skill.Menu1();
                                if(skill.luachon == 1){
                                    skill.datCoc(nguoichoi1);
                                    if(skill.luachon == 1){
                                        if(nguoichoi1.tien >= 10){
                                            sound.Buy();
                                            nguoichoi1.tien-=10;
                                            System.out.println("Đây là bản đồ hiện tại của mình: ");
                                            nguoichoi1.banDoHienTai();
                                            System.out.println("Đây là bản đồ cọc: ");
                                            nguoichoi1.inRaBanDoDatCoc();
                                            System.out.println("Nhập tọa độ bạn muốn đặt cọc: ");
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
                                                if (!nguoichoi1.kiemTraCoc(tmpx, tmpy)) {
                                                    System.out.println("Vị trí đó bạn đã đặt cọc hoặc thuyền đối thủ đã bắn rồi. Vui lòng nhập lại tọa độ: ");
                                                    continue;
                                                }
                                                break;
                                            }
                                            ToaDo toaDo = new ToaDo(tmpx, tmpy);
                                            nguoichoi1.capNhapCoc(toaDo);
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else if(skill.luachon == 2){
                                    skill.ongNhom(nguoichoi1);
                                    if(skill.luachon==1){
                                        if(nguoichoi1.tien>=40){
                                            sound.Buy();
                                            nguoichoi1.tien-=40;
                                            System.out.println("Đây là bản đồ hiện tại của đối thủ.");
                                            nguoichoi2.banDoHienTai();
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else if(skill.luachon == 3){
                                    skill.banhTruongLanhDia(nguoichoi1);
                                    if(skill.luachon==1){
                                        if(nguoichoi1.tien >= 60){
                                            sound.Buy();
                                            nguoichoi1.tien-=60;
                                            moRong = true;
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else{
                                    System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                    continue;
                                }
                                break;
                            }
                            continue;
                        }else{
                            System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay lại menu");
                            continue;
                        }
                    }
                    nguoichoi1.soLuotChoi++;
                    if(nguoichoi1.dieuKienThang(nguoichoi2.BanDo)){
                        slowPrint(2500,"-");
                        sound.Wining();
                        System.out.println("Chúc mừng người chơi 1 đã dành chiến thắng !!!");
                        BXH.add(nguoichoi1);
                        check = true;
                    }
                    System.out.println("Tới lượt của người chơi thứ 2:");
                    while(true){
                        nguoichoi2.MenuCT2();
                        choice_nguoichoi2 = sc.nextInt();
                        sound.Button();
                        if(choice_nguoichoi2 == 1){
                            nguoichoi2.banDoHienTai();
                        }else if(choice_nguoichoi2 == 2){
                            nguoichoi2.banDoCuaDoiThu();
                        }else if(choice_nguoichoi2 == 3){
                            // Vào phần cửa hảng vũ khí của người 1
                            while(true) {
                                cuaHangVuKhi.Menu2();
                                if (cuaHangVuKhi.luachon == 1) {
                                    cuaHangVuKhi.bomCoBan(nguoichoi2);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        sound.Buy();
                                        KhaiHoa it = new KhaiHoa();
                                        it.khaiHoa(nguoichoi2, nguoichoi1, "coban",moRong2);
                                    }else{
                                        continue;
                                    }
                                } else if (cuaHangVuKhi.luachon == 2) {
                                    cuaHangVuKhi.bomNguyenTu(nguoichoi2);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        if(nguoichoi2.tien >= 30){
                                            sound.Buy();
                                            KhaiHoa it = new KhaiHoa();
                                            it.khaiHoa(nguoichoi2,nguoichoi1,"nguyentu",moRong2);
                                        }else{
                                            System.out.println("Bạn ko có đủ tiền để mua vũ khí này. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                            continue;
                                        }
                                    }else{
                                        continue;
                                    }
                                } else if (cuaHangVuKhi.luachon == 3) {
                                    cuaHangVuKhi.mayBay(nguoichoi2);
                                    if (cuaHangVuKhi.luachon == 1) {
                                        if(nguoichoi2.tien >= 60){
                                            sound.Buy();
                                            KhaiHoa it = new KhaiHoa();
                                            it.khaiHoa(nguoichoi2,nguoichoi1,"maybay",moRong2);
                                        }else{
                                            System.out.println("Bạn ko có đủ tiền để mua vũ khí này. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                            continue;
                                        }
                                    }else{
                                        continue;
                                    }
                                } else {
                                    System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay lại cửa hàng vũ khí.");
                                    continue;
                                }
                                break;
                            }
                            moRong2 = false;
                            break;
                        }else if(choice_nguoichoi2 == 4){
                            CuaHangSkill skill = new CuaHangSkill();
                            while(true){
                                skill.Menu2();
                                if(skill.luachon == 1){
                                    skill.datCoc(nguoichoi2);
                                    if(skill.luachon == 1){
                                        if(nguoichoi2.tien >= 10){
                                            sound.Buy();
                                            nguoichoi2.tien-=10;
                                            System.out.println("Đây là bản đồ hiện tại của mình: ");
                                            nguoichoi2.banDoHienTai();
                                            System.out.println("Đây là bản đồ cọc: ");
                                            nguoichoi2.inRaBanDoDatCoc();
                                            System.out.println("Nhập tọa độ bạn muốn đặt cọc: ");
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
                                                if (!nguoichoi2.kiemTraCoc(tmpx, tmpy)) {
                                                    System.out.println("Vị trí đó bạn đã đặt cọc hoặc thuyền đối thủ đã bắn rồi. Vui lòng nhập lại tọa độ: ");
                                                    continue;
                                                }
                                                break;
                                            }
                                            ToaDo toaDo = new ToaDo(tmpx, tmpy);
                                            nguoichoi2.capNhapCoc(toaDo);
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else if(skill.luachon == 2){
                                    skill.ongNhom(nguoichoi2);
                                    if(skill.luachon==1){
                                        if(nguoichoi2.tien>=40){
                                            sound.Buy();
                                            nguoichoi2.tien-=40;
                                            System.out.println("Đây là bản đồ hiện tại của đối thủ.");
                                            nguoichoi1.banDoHienTai();
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else if(skill.luachon == 3){
                                    skill.banhTruongLanhDia(nguoichoi2);
                                    if(skill.luachon==1){
                                        if(nguoichoi2.tien >= 60){
                                            sound.Buy();
                                            nguoichoi2.tien-=60;
                                            moRong2 = true;
                                        }else{
                                            System.out.println("Bạn không có đủ tiền để mua kĩ năng này. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                        }
                                    }else{
                                        System.out.println("Chương trình sẽ quay lại cửa hàng kĩ năng.");
                                        continue;
                                    }
                                }else{
                                    System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay trở lại cửa hàng kĩ năng.");
                                    continue;
                                }
                                break;
                            }
                            continue;
                        }else{
                            System.out.println("Bạn nhập sai rồi. Chương trình sẽ quay lại menu");
                            continue;
                        }
                    }
                    nguoichoi2.soLuotChoi++;
                    if(nguoichoi2.dieuKienThang(nguoichoi1.BanDo)){
                        slowPrint(2500,"-");
                        sound.Wining();
                        System.out.println("Chúc mừng người chơi 2 đã dành chiến thắng !!!");
                        BXH.add(nguoichoi2);
                        check = true;
                    }
                    System.out.println("Tới lượt của người chơi thứ 1:");
                }
            }else if(menu.getChoice() == 2){
                MayTinh mayTinh = new MayTinh();
                mayTinh.hoatDong();
            }else if(menu.getChoice() == 3){
                // Hai máy tính đấu nhau
                MayTinh mayTinh = new MayTinh();
                mayTinh.haiMayTinh();

            }else if(menu.getChoice() == 4){
                if(BXH.isEmpty()){
                    System.out.println("Hiện tại bảng xếp hạng đang trống !");
                }else{
                    Collections.sort(BXH,new NguoiChois());
                    System.out.println("-------------------BẢNG-XẾP-HẠNG--------------------");
                    for(int i=0;i<BXH.size();i++){
                        System.out.println(i+1 +". " + BXH.get(i).tenNguoiChoi + " - Số lượt chơi: " + BXH.get(i).soLuotChoi + " | Map: " + BXH.get(i).kichCoBanDo + "x" + BXH.get(i).kichCoBanDo + ".");
                    }
                    System.out.println("----------------------------------------------------");
                }

            }else if(menu.getChoice() == 5){
                HuongDan huongDan = new HuongDan();
                huongDan.hienThi();
                while(true){
                    int choice_HuongDan = sc.nextInt();
                    sound.Button();
                    huongDan.setChoice(choice_HuongDan);
                    if(huongDan.getChoice() == 1) break;
                    else if(huongDan.getChoice() == 2){
                        System.out.println("Chương trình đang thoát. Cảm ơn bạn đã chơi !!");
                        return;
                    }else{
                        System.out.print("Có vẻ bạn nhập sai lựa chọn, Vui lòng nhập lại: ");
                    }
                }
            }else if(menu.getChoice() == 6){
                while(true){
                    System.out.println("----------------Cài-Đặt---------------------");
                    System.out.println("|1. Tắt nhạc nền.                          |");
                    System.out.println("|2. Bật nhạc nền.                          |");
                    System.out.println("|3. Bật chế độ trời nhiều gió.             |");
                    System.out.println("|4. Tắt chế độ trời nhiều gió.             |");
                    System.out.println("|5. Bật chế độ trời giông bão.             |");
                    System.out.println("|6. Tắt chế độ trời giông bão.             |");
                    System.out.println("--------------------------------------------");
                    System.out.print("Lựa chọn của bạn: ");
                    int chon = sc.nextInt();
                    sound.Button();
                    if(chon == 1){
                        System.out.println("Game đã tắt nhạc nền. Chương trình sẽ quay lại Menu.");
                        clip_main.stop();
                        break;
                    }else if(chon == 2){
                        System.out.println("Game đã bật nhạc nền. Chương trình sẽ quay lại Menu.");
                        clip_main.start();
                        clip_main.loop(clip_main.LOOP_CONTINUOUSLY);
                        break;
                    }else if(chon == 3){
                        System.out.println("Thời tiết đã chuyển sang nhiều gió. Chương trình sẽ quay lại Menu.");
                        clip_wind.start();
                        clip_wind.loop(clip_main.LOOP_CONTINUOUSLY);
                        break;
                    }else if(chon == 4){
                        System.out.println("Đã tắt chế độ trời nhiều gió. Chương trình sẽ quay lại Menu.");
                        clip_wind.stop();
                        break;
                    }else if(chon == 5){
                        System.out.println("Thời tiết đã chuyển sang giông bão. Chương trình sẽ quay lại Menu.");
                        clip_rain.start();
                        clip_rain.loop(clip_main.LOOP_CONTINUOUSLY);
                        break;
                    }else if(chon == 6){
                        System.out.println("Đã tắt chế độ trời giông bão. Chương trình sẽ quay lại Menu.");
                        clip_rain.stop();
                        break;
                    } else{
                        System.out.println("Có vẻ bạn đã nhập sai lựa chọn. Chương trình sẽ quay trở lại Menu Cài Đặt.");
                    }
                }
            }else if(menu.getChoice() == 7){
                System.out.println("Chương trình đang thoát. Cảm ơn bạn đã chơi !!");
                return;
            }else{
                System.out.println("Có vẻ bạn đã nhập sai lựa chọn. Chương trình sẽ quay trở lại Menu.");
            }
        }
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