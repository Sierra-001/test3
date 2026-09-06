import java.io.*;
import java.util.Scanner;

class program {
    public static void main (String[] args) {
        Cylinder();
        Rectangle();
        RightAngleTriangle();
    }
    static void Cylinder() {

        double r, h, v, tsa;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        r = input.nextDouble();
        System.out.print("Enter Height: ");
        h =  input.nextDouble();

        input.close();

        v = calculateV(r, h);
        tsa = TSA(r, h);

        System.out.println("Volume: " + v);
        System.out.println("Total Surface Area: " + tsa);
    }

    static double TSA (double r, double h) {
        return (2 * Math.PI * r * (r + h));
    }

    static double calculateV (double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h);
    }

    static void Rectangle () {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        input.close();
    }
    static void RightAngleTriangle() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the base of the triangle:");
        double base = input.nextDouble();

        System.out.println("Please enter the height of the triangle:");
        double height = input.nextDouble();

        double hypotenuse = Math.sqrt((base * base) + (height * height));
        double perimeter = base + height + hypotenuse;
        double area = (base * height) / 2;

        System.out.println("Hypotenuse = " + hypotenuse);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}