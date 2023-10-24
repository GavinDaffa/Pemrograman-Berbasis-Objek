public class Contoh2 {
    // Atribut
    private String nim;
    private String nama;
    private String prodi;
    private String mataKuliah;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiTugas;

    // Konstruktor
    public Contoh2(String nim, String nama, String prodi, String mataKuliah) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.mataKuliah = mataKuliah;
    }

    // Setter dan Getter untuk NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    // Setter dan Getter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk Prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    // Setter dan Getter untuk Mata Kuliah
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    // Setter dan Getter untuk Nilai UTS
    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Setter dan Getter untuk Nilai UAS
    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    // Setter dan Getter untuk Nilai Tugas
    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    // Metode untuk menghitung nilai akhir (NA)
    public double hitungNA() {
        return (nilaiUTS * 0.20) + (nilaiUAS * 0.25) + (nilaiTugas * 0.55);
    }

    // Metode untuk menampilkan data mahasiswa dan nilai akhir
    public void tampilkanData() {
        System.out.println("\nHasil Perhitungan:");
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Prodi  : " + prodi);
        System.out.println("MK     : " + mataKuliah);
    }
}
