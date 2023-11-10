package Pertemuan_6.polymorphism;

public class TransaksiLaundry extends Laundry {
    private String kode, namaPelanggan, tglCuci, tglAmbil;
    private int berat;

    public TransaksiLaundry(String jenisLaundry, String metode, int harga, String kode, String namaPelanggan,
            String tglCuci, String tglAmbil, int berat) {
        super(jenisLaundry, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTglCuci() {
        return tglCuci;
    }

    public String getTglAmbil() {
        return tglAmbil;
    }

    public int getBerat() {
        return berat;
    }

    public int getTotalHarga() {
        return getBerat() * getHarga();
    }

    public void transaksi() {
        System.out.println("Nama Pelanggan: " + getNamaPelanggan());
        System.out.println("Jenis Laundry: " + getJenisLaundry());
        System.out.println("Metode (Reguler/Kilat/Express): " + getMetode());
        System.out.println("Harga jasa: " + getHarga());
        System.out.println("Tanggal cuci: " + getTglCuci());
        System.out.println("Tanggal ambil: " + getTglAmbil());
        System.out.println("Berat cucian: " + getBerat());
        System.out.println("Subtotal: " + getTotalHarga()); // Subtotal (harga + berat)
        System.out.println("Total Harga: " + hargaExpress()); // + layanan express
    }

    public void transaksi(String kode) {
        System.out.println("Nama Pelanggan: " + getNamaPelanggan());
        System.out.println("Jenis Laundry: " + getJenisLaundry());
        System.out.println("Metode (Reguler/Kilat/Express): " + getMetode());
        System.out.println("Harga jasa: " + getHarga());
        System.out.println("Tanggal cuci: " + getTglCuci());
        System.out.println("Tanggal ambil: " + getTglAmbil());
        System.out.println("Berat cucian: " + getBerat());
        System.out.println("Subtotal: " + getTotalHarga()); // Subtotal (harga + berat)
        System.out.println("Total Harga: " + hargaExpress()); // + layanan express
    }

    // Overriding
    @Override
    public int hargaExpress() {
        int total = getTotalHarga();
        if (getMetode().equalsIgnoreCase("Express")) {
            total += super.hargaExpress();
        }
        return total;
    }

    @Override
    public int hargakilat() {
        int total = getTotalHarga();
        if (getMetode().equalsIgnoreCase("Kilat")) {
            total += super.hargakilat();
        }
        return total;
    }
}
