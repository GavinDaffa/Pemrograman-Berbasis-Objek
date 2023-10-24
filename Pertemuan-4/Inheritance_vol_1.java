import java.util.ArrayList;
import java.util.Scanner;

// Kelas dasar yang mewakili kendaraan
class Kendaraan {
    private String merek;
    private String model;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
    }
}

// Kelas turunan yang mewakili mobil
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String model, int jumlahPintu) {
        super(merek, model);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe: Mobil");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas turunan yang mewakili sepeda motor
class SepedaMotor extends Kendaraan {
    private boolean punyaSidecar;

    public SepedaMotor(String merek, String model, boolean punyaSidecar) {
        super(merek, model);
        this.punyaSidecar = punyaSidecar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe: Sepeda Motor");
        System.out.println("Punya Sidecar: " + (punyaSidecar ? "Ya" : "Tidak"));
    }
}

public class Inheritance_vol_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

        while (true) {
            System.out.println("Sistem Manajemen Kendaraan");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Tambah Sepeda Motor");
            System.out.println("3. Tampilkan Semua Kendaraan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan Merek Mobil: ");
                String merek = scanner.next();
                System.out.print("Masukkan Model Mobil: ");
                String model = scanner.next();
                System.out.print("Masukkan Jumlah Pintu: ");
                int pintu = scanner.nextInt();
                kendaraanList.add(new Mobil(merek, model, pintu));
            } else if (pilihan == 2) {
                System.out.print("Masukkan Merek Sepeda Motor: ");
                String merek = scanner.next();
                System.out.print("Masukkan Model Sepeda Motor: ");
                String model = scanner.next();
                System.out.print("Apakah memiliki sidecar? (ya/tidak): ");
                String inputSidecar = scanner.next();
                boolean sidecar = inputSidecar.equalsIgnoreCase("ya");
                kendaraanList.add(new SepedaMotor(merek, model, sidecar));
            } else if (pilihan == 3) {
                System.out.println("Daftar Kendaraan:");
                for (Kendaraan kendaraan : kendaraanList) {
                    kendaraan.tampilkanInfo();
                    System.out.println();
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
