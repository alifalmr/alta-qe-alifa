public class Arithmetic extends Calculator {
    public void calculateAdd() {
        float result = this.number1 + this.number2;
        System.out.println("Addition result: " + result);
        System.out.println();
    }

    public void calculateSubs () {
        float result = this.number1 - this.number2;
        System.out.println("Substraction result: " + result);
        System.out.println();
    }

    public void calculateMulti () {
        float result = this.number1 * this.number2;
        System.out.println("Multiplication result: " + result);
        System.out.println();
    }

    public void calculateDiv () {
        float result = this.number1 / this.number2;
        System.out.println("Division result: " + result);
        System.out.println();
    }
}