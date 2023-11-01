package PBOQ1_Tugas2_20410100065;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_Kasir {
    public static void main(String[] args) {
        Kasir kasir = new Kasir();
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> belanjaanMap = new HashMap<>();

        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = scanner.nextLine();

        System.out.println("----Enjoy your Food----");
        System.out.println("\nMenu Makanan dan Harga:");
        System.out.println("1. Soto Ayam - Rp 13.000");
        System.out.println("2. Nasi Rawon - Rp 15.000");
        System.out.println("3. Mie Goreng - Rp 12.000");
        System.out.println("4. Nasi Pecel - Rp 10.000");
        System.out.println("5. Nasi Goreng - Rp 13.000");
        System.out.println("\nMenu Minuman dan Harga:");
        System.out.println("6. Es Jeruk - Rp 4.000");
        System.out.println("7. Es Campur - Rp 6.000");

        System.out.print("Pilih menu (jika lebih dari 1 pisahkan dengan spasi): ");
        String inputMenu = scanner.nextLine();
        String[] belanjaan = inputMenu.split(" ");

        for (String item : belanjaan) {
            if (belanjaanMap.containsKey(item)) {
                belanjaanMap.put(item, belanjaanMap.get(item) + 1);
            } else {
                belanjaanMap.put(item, 1);
            }
        }

        System.out.print("Apakah Anda member (ya/tidak)? ");
        String inputMember = scanner.nextLine();
        boolean isMember = inputMember.equalsIgnoreCase("ya");

        int totalHarga = kasir.hitungTotalHarga(belanjaan, isMember);

        System.out.println("\n-----PEMBAYARAN-----");
        System.out.println("Nama = " + namaPelanggan);
        for (String item : belanjaanMap.keySet()) {
            int nomorMenu = Integer.parseInt(item);
            String namaMenu = getNamaMenu(nomorMenu);
            int hargaMenu = getHargaMenu(nomorMenu);
            int jumlahItem = belanjaanMap.get(item);
            System.out.println(namaMenu + " - Rp " + hargaMenu + " = " + jumlahItem);
        }
        System.out.println("----------------------------");
        System.out.println("Total = Rp " + totalHarga);

        if (isMember) {
            int potongan = (int) (totalHarga * 0.2);
            int hargaSetelahPotongan = totalHarga - potongan;
            System.out.println("\nPembayaran Atas nama " + namaPelanggan);
            System.out.println("Potongan Member (20%) = Rp " + potongan);
            System.out.println("Harga setelah potongan = Rp " + hargaSetelahPotongan);
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
