import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float alas;
        float tinggi;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan panjang alas: ");
        alas = input1.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan tinggi: ");
        tinggi = input2.nextFloat();

        float luasSegitiga = (alas*tinggi)/2;


        System.out.println("Luas Segitiga = " + luasSegitiga);
    }
}