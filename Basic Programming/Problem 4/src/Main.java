import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print(number + " is a prime: ");
        System.out.println(primeNumber(number));


    }

    private static boolean primeNumber(int number) {
        int factors = 0;
        boolean result = false;
        if (number == 0 || number == 1) {
            result = false;
        } else if (number == 2 || number == 3 || number == 5) {
            result = true;
        } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            result = false;
        } else {
            for (int i = 6; i <= number; i++) {
                if (number % i == 0) {
                    factors++;
                }
            }
            if (factors < 2) {
                result = true;
            } else if (factors >= 2) {
                result = false;
            }
        }
        return result;
    }

}