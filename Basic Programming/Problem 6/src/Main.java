import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number and I will show you a magic: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        drawBox(number);
        drawBox(3);
        drawBox(5);
        drawBox(1);
    }

    private static void drawBox(int number){
        int position = 1;
        for (int j=0; j<number; j++){
            for (int i=0; i<number; i++) {
                System.out.print(symbolXYZ(position) + " ");
                position++;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char symbolXYZ(int position) {
        char result;
        if (position % 3 == 0){
            result = 'X';
        } else if (position % 2 == 0) {
            result = 'Z';
        } else {
            result = 'Y';
        }
        return result;
    }
}