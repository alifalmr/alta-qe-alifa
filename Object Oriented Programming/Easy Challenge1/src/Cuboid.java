public class Cuboid {
    int length;
    int width;
    int height;

    public Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateVolume () {
        return length * width * height;
    }
}
