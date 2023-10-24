import java.util.ArrayList;
import java.util.Scanner;

class Pegawai {
    private String nama;
    private int umur;
    private String idPegawai;
    private double gajiPokok;

    public Pegawai(String nama, int umur, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.umur = umur;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Gaji Pokok: $" + gajiPokok);
    }
}

class Manajer extends Pegawai {
    private double tunjangan;

    public Manajer(String nama, int umur, String idPegawai, double gajiPokok, double tunjangan) {
        super(nama, umur, idPegawai, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jabatan: Manajer");
        System.out.println("Tunjangan: $" + tunjangan);
    }
}

class Staf extends Pegawai {
    private int jamKerja;

    public Staf(String nama, int umur, String idPegawai, double gajiPokok, int jamKerja) {
        super(nama, umur, idPegawai, gajiPokok);
        this.jamKerja = jamKerja;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jabatan: Staf");
        System.out.println("Jam Kerja per Minggu: " + jamKerja + " jam");
    }
}

public class Inheritance_vol_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        // Input data Manajer
        System.out.println("Masukkan data Manajer:");
        System.out.println("Nama: ");
        String namaManajer = input.nextLine();
        System.out.println("Umur: ");
        int umurManajer = input.nextInt();
        input.nextLine();  // Membersihkan karakter newline
        System.out.println("ID Pegawai: ");
        String idManajer = input.nextLine();
        System.out.println("Gaji Pokok: ");
        double gajiManajer = input.nextDouble();
        System.out.println("Tunjangan: ");
        double tunjanganManajer = input.nextDouble();

        Manajer manajer = new Manajer(namaManajer, umurManajer, idManajer, gajiManajer, tunjanganManajer);
        daftarPegawai.add(manajer);

        // Input data Staf
        System.out.println("Masukkan data Staf:");
        System.out.println("Nama: ");
        String namaStaf = input.next();
        System.out.println("Umur: ");
        int umurStaf = input.nextInt();
        input.nextLine();
        System.out.println("ID Pegawai: ");
        String idStaf = input.nextLine();
        System.out.println("Gaji Pokok: ");
        double gajiStaf = input.nextDouble();
        System.out.println("Jam Kerja per Minggu: ");
        int jamKerjaStaf = input.nextInt();

        Staf staf = new Staf(namaStaf, umurStaf, idStaf, gajiStaf, jamKerjaStaf);
        daftarPegawai.add(staf);

        // Menampilkan informasi pegawai
        System.out.println("\nInformasi Pegawai:");
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.cetakInfo();
            System.out.println("-------------------------------");
        }
    }
}
