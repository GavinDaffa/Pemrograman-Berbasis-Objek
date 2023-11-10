package Pertemuan_6.polymorphism;

import java.io.*;
import java.util.ArrayList;

public class PengelolaLaundry {
    private ArrayList<Laundry> dataLaundry = new ArrayList<>();
    private ArrayList<TransaksiLaundry> transaksi = new ArrayList<>();
    private int transaksiCounter = 1;

    public void menuMaster() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("-- Tambah Jenis Laundry --");
            System.out.print("Masukkan jenis laundry: ");
            String jenisLaundry = br.readLine();
            System.out.print("Masukkan harga: ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan paket: ");
            String metode = br.readLine();

            Laundry laundry = new Laundry(jenisLaundry, metode, harga);
            dataLaundry.add(laundry);

            System.out.println("Data jenis laundry berhasil ditambahkan.");
            System.out.println();

            System.out.print("Tambah jenis laundry lainnya? (y/n): ");
            String tambahLagi = br.readLine();
            if (!tambahLagi.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);
    }

    public void menuTransaksi() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = br.readLine();
        System.out.print("Masukkan berat cucian: ");
        int berat = Integer.parseInt(br.readLine());
        System.out.print("Masukkan tanggal cuci: ");
        String tglCuci = br.readLine();
        System.out.print("Masukkan tanggal Ambil: ");
        String tglAmbil = br.readLine();
        System.out.print("Masukkan Kode transaksi: ");
        String kode = br.readLine();

        System.out.println("-- Pilih Jenis Laundry --");
        for (int i = 0; i < dataLaundry.size(); i++) {
            Laundry laundry = dataLaundry.get(i);
            System.out.println(i + 1 + ". " + laundry.getJenisLaundry() + " - Harga: " + laundry.getHarga() + " - Metode: " + laundry.getMetode());
        }

        System.out.print("Pilih nomor jenis laundry: ");
        int selectedLaundryIndex = Integer.parseInt(br.readLine()) - 1;
        Laundry selectedLaundry = dataLaundry.get(selectedLaundryIndex);

        System.out.print("Pilih metode (Reguler/Kilat/Express): ");
        String metode = br.readLine();

        TransaksiLaundry transaksiLaundry = new TransaksiLaundry(selectedLaundry.getJenisLaundry(), metode, selectedLaundry.getHarga(), kode, namaPelanggan, tglCuci, tglAmbil, berat);
        transaksi.add(transaksiLaundry);
        transaksiCounter++;

        System.out.println("Transaksi berhasil ditambahkan.");
        System.out.println();
    }

    public void cetakData() {
        System.out.println("-- Cetak Data --");
        for (TransaksiLaundry trans : transaksi) {
            trans.transaksi();
            System.out.println();
        }
    }

    public void cariData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Kode transaksi yang dicari: ");
        String kode = br.readLine();
        boolean found = false;

        for (TransaksiLaundry trans : transaksi) {
            if (kode.equalsIgnoreCase(trans.getKode())) {
                trans.transaksi(kode);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode tidak ditemukan.");
        }
    }
}
