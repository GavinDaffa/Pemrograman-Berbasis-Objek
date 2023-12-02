// 20410100065
// Gavin Daffa' Abdurrahman Santoso
// Ganjil
package UTS_Ganjil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Barang m = new Minuman();
        while (true) {
            System.out.println("--- Menu Toko Kita ---");
            System.out.println("1. Entri Data Barang");
            System.out.println("2. Entri Data Penjualan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            System.out.println("");
            switch (menu) {
                case 1:
                    m.entriData(m);
                    break;
                case 2:
                    m.entriData();
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
