import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainClassTiket {
    public static void main(String[] args) {
        Tiket tiket = new Tiket();
        boolean isLoggedIn = tiket.tiketCuy();
        HashMap<String, Login> users = new HashMap<>();
        String namaHotel = "";
        int jumlahKamar = 0;
        double hargaPerKamar = 0.0;
        String namaPesawat = "";
        int jumlahPenumpang = 0;
        double hargaTiketPesawat = 0.0;
        String tujuan = "";
        double totalBiayaKamar = 0.0;
        double totalHarga = 0.0;

        if (isLoggedIn) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("\n---Menu Tiket---:");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");

                try {
                    System.out.print("Pilih menu (1-3): ");
                    int choice = Integer.parseInt(reader.readLine());

                    switch (choice) {
                        case 1:
                        System.out.println("\n-----Input Data Transaksi-----");
                        System.out.print("Nama Hotel: ");
                        namaHotel = reader.readLine();
                        System.out.print("Jumlah Kamar: ");
                        jumlahKamar = Integer.parseInt(reader.readLine());
                        System.out.print("Harga Per Kamar: ");
                        hargaPerKamar = Double.parseDouble(reader.readLine());
                        System.out.print("Nama Pesawat: ");
                        namaPesawat = reader.readLine();
                        System.out.print("Jumlah Penumpang: ");
                        jumlahPenumpang = Integer.parseInt(reader.readLine());
                        System.out.print("Harga Tiket Pesawat: ");
                        hargaTiketPesawat = Double.parseDouble(reader.readLine());
                        System.out.print("Tujuan: ");
                        tujuan = reader.readLine();

                        double totalHargaTiketPesawat = (hargaTiketPesawat * jumlahPenumpang);
                        totalBiayaKamar = ((hargaPerKamar - (0.45 * hargaPerKamar)) * jumlahKamar);
                        double asuransi = jumlahPenumpang * 29000;
                        totalHarga = totalHargaTiketPesawat + asuransi;;

                        System.out.println("\n---Input Data Transaksi---");
                        System.out.println("Nama Hotel          : " + namaHotel);
                        System.out.println("Jumlah Kamar        : " + jumlahKamar);
                        System.out.println("Harga Per Kamar     : " + hargaPerKamar);
                        System.out.println("Nama Pesawat        : " + namaPesawat);
                        System.out.println("Jumlah Penumpang    : " + jumlahPenumpang);
                        System.out.println("Harga Tiket Pesawat : " + hargaTiketPesawat);
                        System.out.println("Tujuan              : " + tujuan);
                            break;

                        case 2:
                        System.out.println("\n-------Transaksi Tiket Pesawat dan Hotel-------");
                        System.out.println("Tujuan : " + tujuan);
                        System.out.println("Nama Hotel: " + namaHotel + " - Jumlah Kamar: " + jumlahKamar + " - Harga Per Kamar: " + hargaPerKamar);
                        System.out.println("Total Biaya Kamar Hotel dengan diskon: " + totalBiayaKamar);
                        System.out.println("Nama Pesawat: " + namaPesawat + " - Jumlah Penumpang: " + jumlahPenumpang + " - Harga Tiket Pesawat: " + hargaTiketPesawat);
                        System.out.println("Total Harga Tiket Pesawat: " + totalHarga);
                            break;

                        case 3:
                            System.out.println("Terimakasih.");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                            break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Keluar dari program.");
        }
    }
}
