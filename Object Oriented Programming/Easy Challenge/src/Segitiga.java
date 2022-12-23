public class Segitiga {
    int alas;
    int tinggi;


    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuas() {
        return this.alas * this.tinggi / 2;
    }

    public int hitungKeliling() {
        return (int) Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2)) + this.alas + this.tinggi;
    }
}
