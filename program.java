import java.io.*;
import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        system.out.println("Please enter the base of the triangle:");
        double base = input.nextDouble();

        system.out.println("Please enter the height of the triangle:");
        double height = input.nextDouble();

        double hypotenuse = Math.sqrt((base * base) + (height * height));
        double perimeter = base + height + hypotenuse;
        double area = (base * height) / 2;

        System.out.println("Hypotenuse = " + hypotenuse);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        input.close();
    }
}