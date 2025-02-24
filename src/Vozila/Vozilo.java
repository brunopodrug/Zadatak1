package Vozila;

public abstract class Vozilo {
    protected String marka;
    private double brzina;

    public Vozilo(String marka, double brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public double getBrzina() {
        return brzina;
    }

    public abstract String kretanje();
}
