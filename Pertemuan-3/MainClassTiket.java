import java.io.*;

public class MainClassTiket {
    public static void main(String[] args) {
        Tiket tiket = new Tiket();
        boolean isLoggedIn = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!isLoggedIn) {
            try {
                System.out.print("Masukkan username: ");
                String inputUsername = br.readLine();
                System.out.print("Masukkan password: ");
                String inputPassword = br.readLine();
                isLoggedIn = tiket.tiketCuy(inputUsername, inputPassword);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.println("\n----Menu Tiket----:");
            System.out.println("1. Input Data Transaksi");
            System.out.println("2. Lihat Data Tiket");
            System.out.println("3. Keluar");

            try {
                System.out.print("Pilih menu (1-3): ");
                int choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("\n------Input Data Transaksi------");
                        System.out.print("Nama Hotel: ");
                        tiket.setNamaHotel(br.readLine());
                        System.out.print("Jumlah Kamar: ");
                        tiket.setJumlahKamar(Integer.parseInt(br.readLine()));
                        System.out.print("Harga Per Kamar: ");
                        tiket.setHargaPerKamar(Double.parseDouble(br.readLine()));
                        System.out.print("Nama Pesawat: ");
                        tiket.setNamaPesawat(br.readLine());
                        System.out.print("Jumlah Penumpang: ");
                        tiket.setJumlahPenumpang(Integer.parseInt(br.readLine()));
                        System.out.print("Harga Tiket Pesawat: ");
                        tiket.setHargaTiketPesawat(Double.parseDouble(br.readLine()));
                        System.out.print("Tujuan: ");
                        tiket.setTujuan(br.readLine());

                        double totalHargaTiketPesawat = (tiket.getHargaTiketPesawat() * tiket.getJumlahPenumpang());
                        tiket.setTotalBiayaKamar((tiket.getHargaPerKamar() - (0.45 * tiket.getHargaPerKamar())) * tiket.getJumlahKamar());
                        double asuransi = tiket.getJumlahPenumpang() * 29000;
                        tiket.setTotalHarga(totalHargaTiketPesawat + asuransi);

                        System.out.println("\n----Input Data Transaksi----");
                        System.out.println("Nama Hotel          : " + tiket.getNamaHotel());
                        System.out.println("Jumlah Kamar        : " + tiket.getJumlahKamar());
                        System.out.println("Harga Per Kamar     : " + tiket.getHargaPerKamar());
                        System.out.println("Nama Pesawat        : " + tiket.getNamaPesawat());
                        System.out.println("Jumlah Penumpang    : " + tiket.getJumlahPenumpang());
                        System.out.println("Harga Tiket Pesawat : " + tiket.getHargaTiketPesawat());
                        System.out.println("Tujuan              : " + tiket.getTujuan());
                        break;

                    case 2:
                        System.out.println("\n--------Transaksi Tiket Pesawat dan Hotel--------");
                        System.out.println("Tujuan : " + tiket.getTujuan());
                        System.out.println("Nama Hotel: " + tiket.getNamaHotel() + " - Jumlah Kamar: " + tiket.getJumlahKamar() + " - Harga Per Kamar: " + tiket.getHargaPerKamar());
                        System.out.println("Total Biaya Kamar Hotel dengan diskon: " + tiket.getTotalBiayaKamar());
                        System.out.println("Nama Pesawat: " + tiket.getNamaPesawat() + " - Jumlah Penumpang: " + tiket.getJumlahPenumpang() + " - Harga Tiket Pesawat: " + tiket.getHargaTiketPesawat());
                        System.out.println("Total Harga Tiket Pesawat: " + tiket.getTotalHarga());
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
    }
}
