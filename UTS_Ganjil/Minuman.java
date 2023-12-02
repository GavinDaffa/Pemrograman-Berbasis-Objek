package UTS_Ganjil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Minuman extends Barang {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String jenis;
    private int jumlahBeli;
    private int total;
    private int diskon;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    public Minuman() {}

    public Minuman(String kode, String nama, String jenis, int harga, int stok) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public Minuman(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public String getJenis() {
        return this.jenis;
    }

    public int total() {
        this.total = getHarga() * this.jumlahBeli;
        return this.total;
    }

    public int diskon() {
        int d = 0;
        if (total() > 200000) {
            this.diskon = total() * 10 / 100;
            d = total() - this.diskon;
        } else {
            System.out.println("-");
        }
        return d;
    }

    public int stokUpdate() {
        int s = getStok();
        if (s <= 0) {
            System.out.println("Stok habis");
        } else if (s > 0) {
            s -= this.jumlahBeli;
            System.out.println("Stok tersisa : " + s);
        }
        return s;
    }

    public void entriData(Barang m) throws IOException {
        System.out.println("--- Data minuman ---");
        System.out.print("Kode barang: ");
        this.kodeBarang = br.readLine();
        System.out.print("Nama barang : ");
        this.namaBarang = br.readLine();
        System.out.print("Jenis barang : ");
        this.jenis = br.readLine();
        System.out.print("Harga barang : ");
        this.harga = Integer.parseInt(br.readLine());
        System.out.print("Stok barang : ");
        this.stok = Integer.parseInt(br.readLine());
        m = new Minuman(this.kodeBarang, this.namaBarang, this.jenis, this.harga, this.stok);
        System.out.println("");
    }

    public void entriData() throws IOException {
        System.out.println("--- Data Penjualan ---");
        System.out.println("Tanggal/jam: " + this.formatter.format(this.date));
        System.out.println("");

        System.out.print("Kode barang :  ");
        String kd = br.readLine();
        // Mencari data barang
        if (kd.equalsIgnoreCase(getKode())) {
            System.out.println("Nama barang : " + getNama());
            System.out.println("Jenis barang : " + getJenis());
            System.out.println("Harga : " + getHarga());
            System.out.println("Stok saat ini : " + getStok());

            System.out.print("Jumlah yang dibeli: ");
            this.jumlahBeli = Integer.parseInt(br.readLine());

            // Memeriksa stok barang
            if (this.jumlahBeli > getStok()) {
                System.out.println("Stok tidak mencukupi.");
            } else {
                stokUpdate();
                System.out.println("Total bayar: " + total());

                if (total() > 200000) {
                    System.out.println("Selamat anda mendapatkan diskon 10%");
                }

                System.out.print("Ingin tambahkan barang lain? Ya/Tidak : ");
                String tambahBarang = br.readLine();
                if (tambahBarang.equalsIgnoreCase("ya") || tambahBarang.equalsIgnoreCase("y")) {
                    entriData(); // Panggil rekursif untuk menambah barang lain
                } else {
                    System.out.print("Ingin cetak struk? Ya/Tidak : ");
                    String konfirm = br.readLine();
                    if (konfirm.equalsIgnoreCase("ya") || konfirm.equalsIgnoreCase("y")) {
                        struk();
                    } else {
                        System.out.println("Terima kasih telah berbelanja");
                    }
                }
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public void struk() {
        System.out.println("--------------------------------------------------");
        System.out.println("\t\t TOKO KITA ");
        System.out.println("Tanggal/jam: " + this.formatter.format(this.date));
        System.out.println("Kasir: Admin");
        System.out.println("--------------------------------------------------");
        System.out.println(getNama() + "\n" + this.jumlahBeli + "x" +
                getHarga() + "\t=" + this.total);
        System.out.println("--------------------------------------------------");
        System.out.println("SUBTOTAL = " + total());
        if (total() > 200000) {
            System.out.println("DISKON = 10%");
            System.out.println("TOTAL = " + diskon());
        } else {
            System.out.println("DISKON = 0");
            System.out.println("TOTAL = " + total());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Maaf barang yang sudah dibeli tidak dapat dikembalikan");
    }
}
