public class Customer extends Person{

    private String id;

    //constructor
    public Customer(String nama, String alamat, String id){
        super(nama, alamat);
        this.id = id;
    }

    public String getId() {
        return id;
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
    

    


    //class turunan/warisan dari class person = dub class
    
}
