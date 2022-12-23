import java.util.Scanner;

public class Package {
    int length;
    int width;
    int height;
    float weight;

    public void inputAttribute () {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length: ");
        this.length = input.nextInt();
        System.out.print("Input the width: ");
        this.width = input.nextInt();
        System.out.print("Input the height: ");
        this.height = input.nextInt();
        System.out.print("Input the weight: ");
        this.weight = input.nextFloat();
    }

    public void getLength (int length) {
        this.length = length;
    }

    public void getWidth (int width) {
        this.width = width;
    }

    public void getHeight (int height) {
        this.height = height;
    }

    public void getWeight (float weight) {
        this.weight = weight;
    }
}
