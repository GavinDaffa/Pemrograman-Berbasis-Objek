package Pertemuan_6.polymorphism;

import java.io.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PengelolaLaundry pengelola = new PengelolaLaundry();

        do {
            System.out.println("-- Laundryku --");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.print("Masukkan pilihan menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("-- 1. Menu Master Data --");
                    pengelola.menuMaster();
                    break;
                case 2:
                    System.out.println("-- 2. Menu Transaksi --");
                    pengelola.menuTransaksi();
                    pengelola.cetakData();
                    break;
                case 3:
                    System.out.println("-- 3. Menu Cari Data --");
                    pengelola.cariData();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
