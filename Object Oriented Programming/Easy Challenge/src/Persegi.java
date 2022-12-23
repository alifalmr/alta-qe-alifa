public class Persegi {
    int side;

    public Persegi(int side) {
        this.side = side;
    }

    public int hitungLuas() {
        return this.side * this.side;
    }

    public int hitungKeliling() {
        return this.side * 4;
    }
}
