//Gavin Daffa' Abdurrahman Santoso
//20410100065

package Re_UTS;

import java.util.*;

public class Aplikasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        List<Tiket> tickets = new ArrayList<>();
        List<LionAir> maskapai = new ArrayList<>();
        List<String> daftarKota = Arrays.asList("Bali", "Lombok", "Jakarta", "Yogyakarta", "Balikpapan", "Makassar", "Surabaya");


        do {
            System.out.println("\nMenu Aplikasi");
            System.out.println("1. Entri Data Pesanan Tiket");
            System.out.println("2. Cetak Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilihan 1/2/3: ");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                scanner.nextLine();
                System.out.print("\nMasukkan Booking ID       : ");
                String bookingID = scanner.nextLine();
                System.out.print("Masukkan NIK              : ");
                String nik = scanner.nextLine();
                System.out.print("Masukkan Nama             : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Jenis Kelamin     : ");
                String jenisKelamin = scanner.nextLine();
                System.out.print("Masukkan Tanggal Berangkat : ");
                String tglBerangkat = scanner.nextLine();
                System.out.print("Masukkan Tanggal Kembali   : ");
                String tglKembali = scanner.nextLine();
                System.out.print("Masukkan Kota Asal         : ");
                String kotaAsal = scanner.nextLine();
                System.out.print("Masukkan Kota Tujuan       : ");
                String kotaTujuan = scanner.nextLine();
                System.out.print("Masukkan Nomor Pesawat     : ");
                String noPesawat = scanner.nextLine();
                System.out.print("Masukkan Nomor Kursi       : ");
                String noKursi = scanner.nextLine();
                System.out.print("Masukkan Jumlah Penumpang  : ");
                int jumlahPenumpang = scanner.nextInt();

                Tiket tiket = new Tiket(bookingID, nik, nama, jenisKelamin, tglBerangkat, tglKembali, kotaAsal);
                LionAir booking = new LionAir(kotaAsal, kotaTujuan, noPesawat, noKursi, jumlahPenumpang);

                tickets.add(tiket);
                maskapai.add(booking);
                System.out.println("\u001B[32mPesan Tiket berhasil!\u001B[0m");
                    break;
                case 2:
                if (tickets.isEmpty() || maskapai.isEmpty()) {
                    System.out.println("\u001B[31m\nPesan tiket terlebih dahulu!\u001B[0m");
                } else {
                    for (int i = 0; i < tickets.size(); i++) {
                        Tiket tiketKu = tickets.get(i);
                        LionAir maskapaiKu = maskapai.get(i);

                        System.out.println("\nTiket " + (i + 1) + ":");
                        System.out.printf("| Booking ID       : %-23s |%n", tiketKu.getBookingID());
                        System.out.printf("| NIK              : %-23s |%n", tiketKu.getNik());
                        System.out.printf("| Nama             : %-23s |%n", tiketKu.getNama());
                        System.out.printf("| Jenis Kelamin    : %-23s |%n", tiketKu.getJenisKelamin());
                        System.out.printf("| Tanggal Berangkat: %-23s |%n", tiketKu.getTglBerangkat());
                        System.out.printf("| Tanggal Kembali  : %-23s |%n", tiketKu.getTglKembali());
                        System.out.printf("| Kota Asal        : %-23s |%n", tiketKu.getKotaAsal());
                        System.out.printf("| Kota Tujuan      : %-23s |%n", maskapaiKu.getKotaTujuan());
                        System.out.printf("| Harga            : Rp%-21d |%n", maskapaiKu.getHarga());
                        System.out.printf("| Total            : Rp%-21d |%n", maskapaiKu.getTotal());
                        System.out.printf("| Nomor Pesawat    : %-23s |%n", maskapaiKu.getNoPesawat());
                        System.out.printf("| Nomor Kursi      : %-23s |%n", maskapaiKu.getNoKursi());

                        // Untuk memeriksa kota yang tersedia
                        if (!daftarKota.contains(tiketKu.getKotaAsal())) {
                            System.out.println("\u001B[31mGagal: cek Kota asal atau kota tujuan!\u001B[0m");
                            continue;
                        }

                        // Untuk memeriksa kota yang tersedia
                        if (!daftarKota.contains(maskapaiKu.getKotaTujuan())) {
                            System.out.println("\u001B[31Gagal: cek Kota keberangkatan atau kota tujuan!\u001B[0m");
                            continue;
                        }
                    }
                }
                    break;
                case 3:
                    System.out.println("Have a nice holiday!");
                    break;
                default:
                    System.out.println("Pilihan hanya ada 1/2/3");
                    break;
            }
        } while (x != 3);

        scanner.close();
    }
}
