import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Maukkan nilai: ");
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();
        String nilaiAkhir = "";

        if(nilai < 0 || nilai > 100){
            System.out.println("invalid");
        } else if (nilai >= 80) {
            nilaiAkhir = "A";
        } else if (nilai >=65) {
            nilaiAkhir = "B+";
        } else if (nilai >=50) {
            nilaiAkhir = "B";
        } else if (nilai >= 35) {
            nilaiAkhir = "C";
        } else if (nilai >=0) {
            nilaiAkhir = "D";
        }
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}