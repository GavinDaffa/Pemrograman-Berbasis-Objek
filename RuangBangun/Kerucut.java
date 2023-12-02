package RuangBangun;
public class Kerucut extends Segitiga {
    private double jariJari;
    private double tinggiKerucut;

    public Kerucut(double alasSegitiga, double tinggiSegitiga, double jariJari, double tinggiKerucut) {
    super(alasSegitiga, tinggiSegitiga);
        this.jariJari = jariJari;
        this.tinggiKerucut = tinggiKerucut;
    }
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggiKerucut;
    }

    // Override getter dan setter dari superclass Segitiga
    @Override
    public double getAlas() {
        return super.getAlas();
    }

    @Override
    public void setAlas(double alas) {
        super.setAlas(alas);
    }

    @Override
    public double getTinggi() {
        return super.getTinggi();
    }

    @Override
    public void setTinggi(double tinggi) {
        super.setTinggi(tinggi);
    }
}
