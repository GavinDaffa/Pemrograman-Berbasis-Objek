import java.io.*;

public class MainClassTiket {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Tiket tiket = new Tiket();

        // Login
        String inputUsername = "";
        String inputPassword = "";

        try {
            System.out.print("Masukkan username: ");
            inputUsername = reader.readLine();
            System.out.print("Masukkan password: ");
            inputPassword = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isLoggedIn = tiket.tiketCuy(inputUsername, inputPassword);

        if (isLoggedIn) {
            while (true) {
                System.out.println("\n----Menu Tiket----:");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");

                try {
                    System.out.print("Pilih menu (1-3): ");
                    int choice = Integer.parseInt(reader.readLine());

                    switch (choice) {
                        case 1:
                            System.out.println("\n------Input Data Transaksi------");
                            System.out.print("Nama Hotel: ");
                            String namaHotel = reader.readLine();
                            System.out.print("Jumlah Kamar: ");
                            int jumlahKamar = Integer.parseInt(reader.readLine());
                            System.out.print("Harga Per Kamar: ");
                            double hargaPerKamar = Double.parseDouble(reader.readLine());
                            System.out.print("Nama Pesawat: ");
                            String namaPesawat = reader.readLine();
                            System.out.print("Jumlah Penumpang: ");
                            int jumlahPenumpang = Integer.parseInt(reader.readLine());
                            System.out.print("Harga Tiket Pesawat: ");
                            double hargaTiketPesawat = Double.parseDouble(reader.readLine());
                            System.out.print("Tujuan: ");
                            String tujuan = reader.readLine();

                            tiket.setTiketData(namaHotel, jumlahKamar, hargaPerKamar, namaPesawat, jumlahPenumpang, hargaTiketPesawat, tujuan);
                            break;

                        case 2:
                            tiket.tampilkanTiketData();
                            break;

                        case 3:
                            System.out.println("Terima kasih.");
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
