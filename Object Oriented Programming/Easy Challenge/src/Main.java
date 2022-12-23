import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luas");

        Persegi persegi1 = new Persegi(4);
        System.out.println("Persegi: " + persegi1.hitungLuas());

        Segitiga segitiga1 = new Segitiga(3,4);
        System.out.println("Segitiga: " + segitiga1.hitungLuas());

        PersegiPanjang persegiP1 = new PersegiPanjang(7,8);
        System.out.println("Persegi Panjang: " + persegiP1.hitungLuas());

        System.out.println();
        System.out.println("Keliling");

        System.out.println("Persegi: " + persegi1.hitungKeliling());

        System.out.println("Segitiga: " + segitiga1.hitungKeliling());

        System.out.println("Persegi Panjang: " + persegiP1.hitungKeliling());

        System.out.println();
        System.out.println("Choose another shape!");
        System.out.print("Persegi/Segitiga/Persegi Panjang: ");
        Scanner input = new Scanner(System.in);
        String shape = input.nextLine();

        if (shape.equals("Persegi") || shape.equals("persegi")) {
            System.out.print("Input the side: ");
            int side = input.nextInt();

            Persegi persegi2 = new Persegi(side);
            System.out.println("Area: " + persegi2.hitungLuas());
            System.out.println("Perimeter: " + persegi2.hitungKeliling());

        } else if (shape.equals("Segitiga") || shape.equals("segitiga")){
            System.out.print("Input the base: ");
            int base = input.nextInt();
            System.out.print("Input the height: ");
            int height = input.nextInt();

            Segitiga segitiga2 = new Segitiga(base,height);
            System.out.println("Area: " + segitiga2.hitungLuas());
            System.out.println("Perimeter: " + segitiga2.hitungKeliling());

        } else if (shape.equals("Persegi Panjang") || shape.equals("persegi panjang") || shape.equals("Persegi panjang") || shape.equals("persegi Panjang")){
            System.out.print("Input the lenght: ");
            int lenght = input.nextInt();
            System.out.print("Input the width: ");
            int width = input.nextInt();

            PersegiPanjang persegiP2 = new PersegiPanjang(lenght,width);
            System.out.println("Area: " + persegiP2.hitungLuas());
            System.out.println("Perimeter: " + persegiP2.hitungKeliling());

        } else {
            System.out.println("Wrong shape!");
        }
    }
}