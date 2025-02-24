public class Trokut extends GeometrijskiLik {
    private int a;
    private int b;
    private int c;

    public Trokut(String naziv, int a, int b, int c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double opseg() {
        return (a + b + c);
    }

    @Override
    public double povrsina() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
