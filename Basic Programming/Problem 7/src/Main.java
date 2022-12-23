import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[] listNumber = {1,2,3,4};
        System.out.println(mean(listNumber));

        float[] listNumber1 = {4,3,2.4f,3.8f,2.7f};
        System.out.println(mean(listNumber1));

        System.out.println();
        System.out.println("Input another list of numbers!");
        System.out.print("How many numbers you would like to input: ");
        Scanner input = new Scanner(System.in);
        int lenght = input.nextInt();

        System.out.println("Input the numbers! (use comma ',')");
        float[] listNumber2 = new float[lenght];

        int position = 1;
        for (int i=0; i<lenght; i++) {
            System.out.print("Number " + position + ": ");
            float number = input.nextFloat();
            listNumber2[i] = number;
            position++;
        }

        System.out.print("The mean of the numbers is: ");
        System.out.print(mean(listNumber2));
//        for (int i=0; i<listNumber.length; i++) {
//            System.out.println(listNumber[i]);
        }

    private static float mean (float[] listNumber) {
        float sum = 0;
        for (int i=0; i<listNumber.length; i++) {
            sum = sum + listNumber[i];
        }
        float mean = sum / listNumber.length;
        return mean;
    }
}