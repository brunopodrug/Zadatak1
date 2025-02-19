package Vozila;

public class Bicikl extends Vozilo{
    private String vrsta;

    public Bicikl(String marka, double brzina, String vrsta) {
        super(marka, brzina);
        this.vrsta = vrsta;
    }

    @Override
    public String kretanje() {
        return "Bicikl " + getMarka() + " " + vrsta + " se krece brzinom " + getBrzina() + " km/h";
    }
}
