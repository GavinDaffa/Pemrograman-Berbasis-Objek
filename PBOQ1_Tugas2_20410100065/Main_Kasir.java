package PBOQ1_Tugas2_20410100065;

import java.util.Scanner;

public class Main_Kasir {
    public static void main(String[] args) {
        Kasir kasir = new Kasir();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kasir!");
        System.out.println("Menu Makanan dan Harga:");
        System.out.println("1. Soto Ayam - Rp 13.000");
        System.out.println("2. Nasi Rawon - Rp 15.000");
        System.out.println("3. Mie Goreng - Rp 12.000");
        System.out.println("4. Nasi Pecel - Rp 10.000");
        System.out.println("5. Nasi Goreng - Rp 13.000");
        System.out.println("Menu Minuman dan Harga:");
        System.out.println("6. Es Jeruk - Rp 4.000");
        System.out.println("7. Es Campur - Rp 6.000");

        System.out.print("Pilih menu (pisahkan dengan spasi): ");
        String inputMenu = scanner.nextLine();
        String[] belanjaan = inputMenu.split(" ");

        System.out.print("Apakah Anda member (ya/tidak)? ");
        String inputMember = scanner.nextLine();
        boolean isMember = inputMember.equalsIgnoreCase("ya");

        int totalHarga = kasir.hitungTotalHarga(belanjaan, isMember);

        System.out.println("\nMenu yang dipesan:");
        for (String item : belanjaan) {
            int nomorMenu = Integer.parseInt(item);
            String namaMenu = getNamaMenu(nomorMenu);
            int hargaMenu = getHargaMenu(nomorMenu);
            System.out.println(namaMenu + " - Rp " + hargaMenu);
        }

        System.out.println("Total Harga: Rp " + totalHarga);

        if (isMember) {
            int potongan = (int) (totalHarga * 0.2);
            int hargaSetelahPotongan = totalHarga - potongan;
            System.out.println("\nPotongan Member (20%): Rp " + potongan);
            System.out.println("\nHarga setelah potongan: Rp " + hargaSetelahPotongan);
        }
    }

    private static String getNamaMenu(int nomorMenu) {
        switch (nomorMenu) {
            case 1:
                return "Soto Ayam";
            case 2:
                return "Nasi Rawon";
            case 3:
                return "Mie Goreng";
            case 4:
                return "Nasi Pecel";
            case 5:
                return "Nasi Goreng";
            case 6:
                return "Es Jeruk";
            case 7:
                return "Es Campur";
            default:
                return "Menu Tidak Ditemukan";
        }
    }

    private static int getHargaMenu(int nomorMenu) {
        switch (nomorMenu) {
            case 1:
                return 13000;
            case 2:
                return 15000;
            case 3:
                return 12000;
            case 4:
                return 10000;
            case 5:
                return 13000;
            case 6:
                return 4000;
            case 7:
                return 6000;
            default:
                return 0;
        }
    }
}
