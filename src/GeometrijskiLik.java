public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public abstract double povrsina();

    public abstract double opseg();


    @Override
    public String toString() {
        return "Naziv: " + naziv + "\t" + "Povrsina: " + povrsina() + "\t" + "Opseg: " + opseg();
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }
}

// Ako klasa ima apstraktnu metodu, klasa mora biti apstraktna.
// Ne mozemo instancirati(kreirati) objekte iz apstraktne klase.
// Apstraktna klasa moze biti nasljedena.
// Moramo implementirati(iskoristit) sve metode apstraktne klase.