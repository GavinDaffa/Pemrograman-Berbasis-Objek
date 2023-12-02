package UTS_Ganjil_1;

import java.io.IOException;

public class Minuman extends Barang {
    private String jenis;
    private int jumlahBeli;
    private int total;
    private int diskon;

    public Minuman(String kode, String nama, String jenis, int harga, int stok) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
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

    @Override
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

    @Override
    public void entriData(Barang m) throws IOException {
        System.out.println("--- Data minuman ---");
        // Implementasi entri data barang
    }

    @Override
    public void entriData() throws IOException {
        System.out.println("--- Data Penjualan ---");
        // Implementasi entri data penjualan
    }

    @Override
    public void struk() {
        System.out.println("--- Cetak Struk ---");
        // Implementasi cetak struk
    }
}
