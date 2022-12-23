import java.util.Scanner;

public class Calculator {
    float number1;
    float number2;

    public void inputNumber () {
        System.out.print("Input the first number: ");
        Scanner input = new Scanner(System.in);
        this.number1 = input.nextFloat();
        System.out.print("Input the second number: ");
        this.number2 = input.nextFloat();

    }

    public void getNumber1 (float number1) {
        this.number1 = number1;
    }

    public void getNumber2 (float number2) {
        this.number2 = number2;
    }
}
