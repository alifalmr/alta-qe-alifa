public class Main {
    public static void main(String[] args) {

        System.out.println("Addition");
        Arithmetic operation = new Arithmetic();
        operation.inputNumber();
        operation.calculateAdd();

        System.out.println("Substraction");
        operation.inputNumber();
        operation.calculateSubs();

        System.out.println("Multiplication");
        operation.inputNumber();
        operation.calculateMulti();

        System.out.println("Division");
        operation.inputNumber();
        operation.calculateDiv();

    }
}