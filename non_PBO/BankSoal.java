package non_PBO;

import java.util.ArrayList;
import java.util.List;

public class BankSoal {
    private List<Soal> daftarSoal;

    public BankSoal() {
        this.daftarSoal = new ArrayList<>();
    }

    public void tambahSoal(Soal soal) {
        daftarSoal.add(soal);
    }

    public List<Soal> getDaftarSoal() {
        return daftarSoal;
    }
}


