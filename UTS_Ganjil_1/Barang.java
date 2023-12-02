package UTS_Ganjil_1;

import java.io.IOException;

public class Barang implements Int_barang {
    String kodeBarang;
    String namaBarang;
    int harga;
    int stok;

    public Barang(String kode, String nama, int harga, int stok) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return this.kodeBarang;
    }

    public String getNama() {
        return this.namaBarang;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
    }

    public int stokUpd() {
        return 0;
    }

    public void entriData(Barang m) throws IOException {}

    public void entriData() throws IOException {}

    @Override
    public int stokUpdate() {
        throw new UnsupportedOperationException("Method 'stokUpdate' belum diimplementasikan");
    }

    @Override
    public void struk() {
        throw new UnsupportedOperationException("Method 'struk' belum diimplementasikan");
    }
}
