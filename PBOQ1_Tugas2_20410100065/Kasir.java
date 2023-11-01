package PBOQ1_Tugas2_20410100065;
public class Kasir extends Abstract_Kasir {
    public int hitungTotalHarga(String[] belanjaan, boolean isMember) {
        int totalHarga = 0;
        for (String item : belanjaan) {
            int hargaItem = 0;
            switch (item) {
                case "1":
                    hargaItem = soto_ayam;
                    break;
                case "2":
                    hargaItem = nasi_rawon;
                    break;
                case "3":
                    hargaItem = mie_goreng;
                    break;
                case "4":
                    hargaItem = nasi_pecel;
                    break;
                case "5":
                    hargaItem = nasi_goreng;
                    break;
                case "6":
                    hargaItem = es_jeruk;
                    break;
                case "7":
                    hargaItem = es_campur;
                    break;
                default:
                    System.out.println("Nomor menu tidak valid: " + item);
            }
            totalHarga += hargaItem;
        }

        return totalHarga;
    }
}
