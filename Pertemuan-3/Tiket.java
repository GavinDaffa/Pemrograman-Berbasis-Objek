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

    public Tiket() {
        username = "admin";
        password = "123";
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

    public void setTiketData(String namaHotel, int jumlahKamar, double hargaPerKamar, String namaPesawat,
            int jumlahPenumpang, double hargaTiketPesawat, String tujuan) {
        this.namaHotel = namaHotel;
        this.jumlahKamar = jumlahKamar;
        this.hargaPerKamar = hargaPerKamar;
        this.namaPesawat = namaPesawat;
        this.jumlahPenumpang = jumlahPenumpang;
        this.hargaTiketPesawat = hargaTiketPesawat;
        this.tujuan = tujuan;
    }

    public void tampilkanTiketData() {
        System.out.println("\n--------Transaksi Tiket Pesawat dan Hotel--------");
        System.out.println("Nama Hotel: " + namaHotel + " - Jumlah Kamar: " + jumlahKamar + " - Harga Per Kamar: " + hargaPerKamar);
        double totalBiayaKamar = ((hargaPerKamar - (0.45 * hargaPerKamar)) * jumlahKamar);
        System.out.println("Total Biaya Kamar Hotel dengan diskon: " + totalBiayaKamar);
        System.out.println("Nama Pesawat: " + namaPesawat + " - Jumlah Penumpang: " + jumlahPenumpang + " - Harga Tiket Pesawat: " + hargaTiketPesawat);
        double totalHarga = totalBiayaKamar + (hargaTiketPesawat * jumlahPenumpang);
        System.out.println("Total Harga Tiket Pesawat: " + totalHarga);
    }
}
