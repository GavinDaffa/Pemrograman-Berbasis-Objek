public class subClass extends superClass {

    private int usia;

    public subClass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    @Override
    public String getKeterangan() {
        // TODO Auto-generated method stub
        return super.getKeterangan();
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        return super.getNama();
    }

    
    
}
