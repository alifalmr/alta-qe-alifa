public class PersegiPanjang {
    int length;
    int width;

    public PersegiPanjang(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int hitungLuas() {
        return this.length * this.width;
    }

    public int hitungKeliling() {
        return (2 * this.length) + (2 * this.width);
    }
}
