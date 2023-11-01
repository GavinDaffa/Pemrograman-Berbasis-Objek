import java.io.*;

public class mainClassSuper {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        subClass s = new subClass("", "", 0);

    System.out.println("--INPUT--");
    System.out.println("Masukkan Nama : ");
    String nama = br.readLine();
    System.out.println("Masukkan Keterangan : ");
    String ket = br.readLine();
    System.out.println("Masukkan Usia : ");
    int usia = Integer.parseInt(br.readLine());
    
    s = new subClass(nama, ket, usia);
    
    System.out.println("Nama :" + s.getNama());
    System.out.println("Keterangan : " + s.getKeterangan());
    System.out.println("Usia : "+s.getUsia()+" tahun");

    }

}
