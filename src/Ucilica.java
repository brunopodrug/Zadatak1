import java.util.ArrayList;
import java.util.List;

public class Ucilica {
    private ArrayList<GeometrijskiLik> likovi;

    public Ucilica() {
        this.likovi = new ArrayList<>();
    }

    public ArrayList<GeometrijskiLik> getLikovi() {
        return likovi;
    }

    public void dodajGeometrijskiLik(GeometrijskiLik lik) {
        likovi.add(lik);
    }
    public void ispisGeometrijskogLika() {
        for (GeometrijskiLik lik : this.likovi)
            System.out.println(lik);
    }

    public void sortirajGeometrijskeLikove(){
        likovi.sort(null);
    }
}
