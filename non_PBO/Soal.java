package non_PBO;

import java.util.List;

public class Soal {
    private String pertanyaan;
    private List<String> pilihanJawaban;
    private String jawabanBenar;

    public Soal(String pertanyaan, List<String> pilihanJawaban, String jawabanBenar) {
        this.pertanyaan = pertanyaan;
        this.pilihanJawaban = pilihanJawaban;
        this.jawabanBenar = jawabanBenar;
    }

    public Soal(String pertanyaan, String jawabanBenar) {
        this.pertanyaan = pertanyaan;
        this.jawabanBenar = jawabanBenar;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public List<String> getPilihanJawaban() {
        return pilihanJawaban;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }
}



