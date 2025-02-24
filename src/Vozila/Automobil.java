package Vozila;

public class Automobil extends Vozilo{
    private int brojVrata;

    public Automobil(String marka, double brzina, int brojVrata) {
        super(marka, brzina);
        this.brojVrata = brojVrata;
    }

    @Override
    public String kretanje() {
        return "Automobil " + marka + ", sa " + brojVrata + " vrata se krece brzinom " + getBrzina() + " km/h";
    }
}
