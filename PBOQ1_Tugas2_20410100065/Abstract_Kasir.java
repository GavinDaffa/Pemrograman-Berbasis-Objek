package PBOQ1_Tugas2_20410100065;

public abstract class Abstract_Kasir {
    protected int soto_ayam = 13000;
    protected int nasi_rawon = 15000;
    protected int mie_goreng = 12000;
    protected int nasi_pecel = 10000;
    protected int nasi_goreng = 13000;
    protected int es_jeruk = 4000;
    protected int es_campur = 6000;

    public abstract int hitungTotalHarga(String[] belanjaan, boolean isMember);
}
