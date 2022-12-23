public class Cylinder {
    int radius;
    int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public float calculateVolume () {
        return (float) (3.141593 * Math.pow(radius, 2) * height);
    }
}
