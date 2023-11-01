public class Employee extends Person{

    private String id_emp;

    public Employee(String nama, String alamat, String id_emp) {
        super(nama, alamat);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    @Override
    public String getAlamat() {
        // TODO Auto-generated method stub
        return super.getAlamat();
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        return super.getNama();
    }
    
}
