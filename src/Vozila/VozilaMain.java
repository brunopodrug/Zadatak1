package Vozila;

import java.util.ArrayList;

public class VozilaMain {
    public static void main(String[] args) {
        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(new Automobil("BMW", 299.99,2));
        vozila.add(new Automobil("Audi", 249.77, 4));
        vozila.add(new Bicikl("BMX", 39.99, "planinska"));
        vozila.add(new Bicikl("Mountain", 21.21, "planinska"));

        for(Vozilo vozilo : vozila) {
            System.out.println(vozilo.kretanje());
        }
    }
}
