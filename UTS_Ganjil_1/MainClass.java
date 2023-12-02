package UTS_Ganjil_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Minuman minuman = new Minuman("K1", "Minuman 1", "Jenis 1", 10000, 50);
        int menu;

        while (true) {
            System.out.println("--- Menu Toko ---");
            System.out.println("1. Entri Data Barang");
            System.out.println("2. Entri Data Penjualan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = Integer.parseInt(br.readLine());
            System.out.println("");
            switch (menu) {
                case 1:
                    minuman.entriData(minuman);
                    break;
                case 2:
                    minuman.entriData();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
