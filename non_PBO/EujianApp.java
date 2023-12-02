package non_PBO;

import java.util.List;
import java.util.Scanner;

public class EujianApp {
    public static void main(String[] args) {
        BankSoal bankSoal = new BankSoal();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan soal ke bank soal
        bankSoal.tambahSoal(new Soal("Apa nama ilmu yang mempelajari tentang benda langit di luar angkasa?", List.of("a. Biologi", "b. Astronomi", "c. Kimia"), "b"));
        bankSoal.tambahSoal(new Soal("Siapa penulis drama 'Romeo dan Juliet'?", List.of("a. William Shakespeare", "b. Jane Austen", "c. Charles Dickens"), "a"));
        bankSoal.tambahSoal(new Soal("Berapakah hasil dari 4 x 5?", List.of("a. 16", "b. 20", "c. 25"), "b"));
        bankSoal.tambahSoal(new Soal("Apa nama ibukota Perancis?", List.of("a. Madrid", "b. Paris", "c. Roma"), "b"));
        bankSoal.tambahSoal(new Soal("Siapa tokoh fiksi pahlawan super yang berjuluk 'Man of Steel'?", List.of("a. Batman", "b. Spider-Man", "c. Superman"), "c"));

        // Menambahkan soal essay ke bank soal
        bankSoal.tambahSoal(new Soal("Jelaskan perbedaan antara mitosis dan meiosis dalam proses reproduksi sel.", null, "Jawaban essay"));
        bankSoal.tambahSoal(new Soal("Bagaimana dampak penggunaan teknologi di era digital terhadap komunikasi manusia?", null, "Jawaban essay"));
        bankSoal.tambahSoal(new Soal("Jelaskan konsep dasar dari kecerdasan buatan (artificial intelligence).", null, "Jawaban essay"));
        bankSoal.tambahSoal(new Soal("Apa yang dimaksud dengan efek rumah kaca dan bagaimana dampaknya terhadap perubahan iklim?", null, "Jawaban essay"));
        bankSoal.tambahSoal(new Soal("Jelaskan peran dan fungsi dari Badan PBB seperti UNICEF dalam pembangunan dunia.", null, "Jawaban essay"));

        int nilai = 0;

        // Menampilkan dan menguji jawaban
        List<Soal> daftarSoal = bankSoal.getDaftarSoal();
        for (Soal soal : daftarSoal) {
            System.out.println(soal.getPertanyaan());
            if (soal.getPilihanJawaban() != null) {
                for (String pilihan : soal.getPilihanJawaban()) {
                    System.out.println(pilihan);
                }
                System.out.print("Masukkan jawaban Anda: ");
                String jawabanPengguna = scanner.nextLine();
                if (jawabanPengguna.equalsIgnoreCase(soal.getJawabanBenar())) {
                    System.out.println("Jawaban Benar!");
                    nilai++;
                } else {
                    System.out.println("Jawaban Salah.");
                }
            } else {
                System.out.print("Jawaban Essay: ");
                String jawabanEssay = scanner.nextLine();
                // Mungkin dilakukan penilaian untuk jawaban essay
            }
            System.out.println();
        }

        // Menampilkan nilai akhir
        System.out.println("Nilai Akhir: " + nilai);
    }
}

