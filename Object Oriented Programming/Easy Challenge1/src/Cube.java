public class Cube {
    int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    public int calculateVolume () {
        return (int) Math.pow(edge,3);
    }
}
