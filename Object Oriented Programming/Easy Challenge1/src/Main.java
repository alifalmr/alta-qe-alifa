import javax.swing.undo.CannotUndoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Volume");
        Cube cube1 = new Cube(10);
        System.out.println("Cube: " + cube1.calculateVolume());

        Cuboid cuboid1 = new Cuboid(3,6,10);
        System.out.println("Cuboid: " + cuboid1.calculateVolume());

        Cylinder cylinder1 = new Cylinder(7,10);
        System.out.println("Cylinder: " + cylinder1.calculateVolume());

        System.out.println();
        System.out.println("Choose another shape!");
        System.out.print("Cube/Cuboid/Cylinder: ");
        Scanner input = new Scanner(System.in);
        String shape = input.nextLine();

        if (shape.equals("Cube") || shape.equals("cube")) {
            System.out.print("Input the edge: ");
            int edge = input.nextInt();

            Cube cube2 = new Cube(edge);
            System.out.println("Volume: " + cube2.calculateVolume());

        } else if (shape.equals("Cuboid") || shape.equals("cuboid")){
            System.out.print("Input the length: ");
            int length = input.nextInt();
            System.out.print("Input the width: ");
            int width = input.nextInt();
            System.out.print("Input the height: ");
            int height = input.nextInt();

            Cuboid cuboid2 = new Cuboid(length,width,height);
            System.out.println("Volume: " + cuboid2.calculateVolume());

        } else if (shape.equals("Cylinder") || shape.equals("cylinder")){
            System.out.print("Input the radius: ");
            int radius = input.nextInt();
            System.out.print("Input the height: ");
            int heigt = input.nextInt();

            Cylinder cylinder2 = new Cylinder(radius,heigt);
            System.out.println("Volume: " + cylinder2.calculateVolume());

        } else {
            System.out.println("Wrong shape!");
        }

    }
}