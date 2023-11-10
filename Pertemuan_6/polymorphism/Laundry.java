package Pertemuan_6.polymorphism;

public class Laundry {
    private String jenisLaundry;
    private String metode;
    private int harga;

    public Laundry(String jenisLaundry, String metode, int harga) {
        this.jenisLaundry = jenisLaundry;
        this.metode = metode;
        this.harga = harga;
    }

    public String getJenisLaundry() {
        return jenisLaundry;
    }

    public String getMetode() {
        return metode;
    }

    public int getHarga() {
        return harga;
    }

    public int hargaExpress() {
        return 5000;
    }
    public int hargakilat(){
        return 2500;
    }
}
