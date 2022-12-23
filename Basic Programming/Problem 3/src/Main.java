import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int i;
        int modulo;

        System.out.print("Input a number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println("The factors are:");
        for (i=1; i<=number; i++){
            modulo = number % i;
            if(modulo == 0){
                System.out.println(i);
            }
        }
    }
}