public class Tiket {
    private String username;
    private String password;
    private String namaHotel;
    private int jumlahKamar;
    private double hargaPerKamar;
    private String namaPesawat;
    private int jumlahPenumpang;
    private double hargaTiketPesawat;
    private String tujuan;
    private double totalBiayaKamar;
    private double totalHarga;

    public Tiket() {
        username = "admin";
        password = "123";
    }

    // Getter dan Setter untuk Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean tiketCuy(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil.");
            return true;
        } else {
            System.out.println("Login gagal.");
            return false;
        }
    }

    // Getter dan Setter untuk Nama Hotel
    public String getNamaHotel() {
        return namaHotel;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    // Getter dan Setter untuk Jumlah Kamar
    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    // Getter dan Setter untuk Harga Per Kamar
    public double getHargaPerKamar() {
        return hargaPerKamar;
    }

    public void setHargaPerKamar(double hargaPerKamar) {
        this.hargaPerKamar = hargaPerKamar;
    }

    // Getter dan Setter untuk Nama Pesawat
    public String getNamaPesawat() {
        return namaPesawat;
    }

    public void setNamaPesawat(String namaPesawat) {
        this.namaPesawat = namaPesawat;
    }

    // Getter dan Setter untuk Jumlah Penumpang
    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    // Getter dan Setter untuk Harga Tiket Pesawat
    public double getHargaTiketPesawat() {
        return hargaTiketPesawat;
    }

    public void setHargaTiketPesawat(double hargaTiketPesawat) {
        this.hargaTiketPesawat = hargaTiketPesawat;
    }

    // Getter dan Setter untuk Tujuan
    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    // Getter dan Setter untuk Total Biaya Kamar
    public double getTotalBiayaKamar() {
        return totalBiayaKamar;
    }

    public void setTotalBiayaKamar(double totalBiayaKamar) {
        this.totalBiayaKamar = totalBiayaKamar;
    }

    // Getter dan Setter untuk Total Harga
    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
