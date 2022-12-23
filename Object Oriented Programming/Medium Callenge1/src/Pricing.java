public class Pricing extends Package {
    int minPrice = 5000;
    public int dimension () {
        int volume = this.length * this.width * this.height;
        return volume;
    }

    public void standard () {
        int dimension1 = dimension();
        if (dimension1 < 50) {
            minimal();
        } else {
            weightBased();
        }
    }

    public void minimal () {
        System.out.println("Harga: " + minPrice);
    }

    public void weightBased () {
        int price = Math.round(this.weight) * minPrice;
        System.out.println("Harga: " + price);
    }

}
