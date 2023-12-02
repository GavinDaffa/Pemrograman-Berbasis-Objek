package Re_UTS;

public class LionAir {
    private int jumlahPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;

    public LionAir(String kotaAsal, String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang) {
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
        this.jumlahPenumpang = jumlahPenumpang;
        this.harga = getHarga(kotaAsal, kotaTujuan);
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        return harga * jumlahPenumpang;
    }

    private int getHarga(String kotaAsal, String kotaTujuan) {
        if (kotaAsal.equals("Surabaya")) {
            switch (kotaTujuan) {
                case "Bali":
                case "Lombok":
                    return 500000;
                case "Jakarta":
                case "Yogyakarta":
                    return 600000;
                case "Balikpapan":
                case "Makassar":
                    return 700000;
                default:
                    return 0;
            }
        } else if (kotaAsal.equals("Jakarta")) {
            switch (kotaTujuan) {
                case "Bali":
                case "Lombok":
                    return 700000;
                case "Surabaya":
                case "Yogyakarta":
                    return 750000;
                case "Balikpapan":
                case "Makassar":
                    return 800000;
                default:
                    return 0;
            }
        }
        return 0;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }
}
