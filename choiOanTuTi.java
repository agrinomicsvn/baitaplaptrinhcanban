public static void choiOanTuTiVongLap() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int diemNguoiChoi = 0;
    int diemAI = 0;

    while (true) {
        System.out.println("1. Kim");
        System.out.println("2. Bao");
        System.out.println("3. Kéo");
        System.out.println("0. Nghỉ chơi");

        int luaChonNguoiChoi = scanner.nextInt();

        if (luaChonNguoiChoi == 0) {
            break; 
        }

        if (luaChonNguoiChoi < 1 || luaChonNguoiChoi > 3) {
            System.out.println("Lựa chọn không hợp lệ, vui lòng chơi lại.");
            System.out.println("============================");
            continue;
        }

        int luaChonAI = (int)(Math.random() * 3) + 1;

        String chuoiNguoiChoi = "";
        if (luaChonNguoiChoi == 1) {
            chuoiNguoiChoi = "Kim";
        } else if (luaChonNguoiChoi == 2) {
            chuoiNguoiChoi = "Bao";
        } else {
            chuoiNguoiChoi = "Kéo";
        }

        String chuoiAI = "";
        if (luaChonAI == 1) {
            chuoiAI = "Kim";
        } else if (luaChonAI == 2) {
            chuoiAI = "Bao";
        } else {
            chuoiAI = "Kéo";
        }

        if (luaChonNguoiChoi == luaChonAI) {
            System.out.println("Hai bên cùng chọn " + chuoiNguoiChoi);
        } else {
            System.out.println("Người chơi chọn " + chuoiNguoiChoi);
            System.out.println("AI chọn " + chuoiAI);
        }
        System.out.println("============================");

        if (luaChonNguoiChoi != luaChonAI) {
            if ((luaChonNguoiChoi == 1 && luaChonAI == 3) ||
                (luaChonNguoiChoi == 2 && luaChonAI == 1) ||
                (luaChonNguoiChoi == 3 && luaChonAI == 2)) {
                diemNguoiChoi++;
            } else {
                diemAI++;
            }
        }
    }

    System.out.println("============================");
    if (diemNguoiChoi > diemAI) {
        System.out.println("Người chơi thắng nhiều nhất");
    } else if (diemAI > diemNguoiChoi) {
        System.out.println("AI thắng nhiều nhất");
    } else {
        System.out.println("Hòa nhau!");
    }
    System.out.println("Tỷ số là: Người chơi: " + diemNguoiChoi + " --- AI: " + diemAI);
}