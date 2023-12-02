package RuangBangun;

import java.io.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan panjang alas Segitiga: ");
        double alasSegitiga = Double.parseDouble(br.readLine());

        System.out.print("Masukkan tinggi Segitiga: ");
        double tinggiSegitiga = Double.parseDouble(br.readLine());

        System.out.print("Masukkan jari-jari Kerucut: ");
        double jariJariKerucut = Double.parseDouble(br.readLine());

        System.out.print("Masukkan tinggi Kerucut: ");
        double tinggiKerucut = Double.parseDouble(br.readLine());

        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        Kerucut kerucut = new Kerucut(alasSegitiga, tinggiSegitiga, jariJariKerucut, tinggiKerucut);

        System.out.println("----HASIL PERHITUNGAN---");
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
    }
}
