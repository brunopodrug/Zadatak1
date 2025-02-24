import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();

        Krug krug = new Krug("Mali", 4);
        Pravokutnik pravokutnik = new Pravokutnik("manji", 3, 5);
        Trokut trokut = new Trokut("plavi", 9, 6, 7);
/*        ArrayList<GeometrijskiLik> likovi = new ArrayList<>();
        likovi.add(krug);
        likovi.add(pravokutnik);
        likovi.add(trokut);
        likovi.add(new Krug("Veliki", 15));
        likovi.add(new Trokut("zuti", 8, 49, 55));
        likovi.add(new Pravokutnik("veci", 15, 19));*/

        ucilica.dodajGeometrijskiLik(krug);
        ucilica.dodajGeometrijskiLik(pravokutnik);
        ucilica.dodajGeometrijskiLik(trokut);
        ucilica.dodajGeometrijskiLik(new Krug("Veliki", 15));
        ucilica.dodajGeometrijskiLik(new Trokut ("zuti", 8, 49, 55));
        ucilica.dodajGeometrijskiLik(new Pravokutnik("veci", 15, 19));

        ucilica.ispisGeometrijskogLika();

        System.out.println("------------------------------------------------------------");
        System.out.println("Sortiranje geometrijskih likova po površini:");
        ucilica.sortirajGeometrijskeLikove();
        ucilica.ispisGeometrijskogLika();

    }
}