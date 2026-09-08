import java.io.*;
import java.util.Scanner;

class program {
    public static void main (String[] args) {
        CuboidCalculator();
        Cylinder();
        Rectangle();
        RightAngleTriangle();
        Sphere();
        EvenOddCounter();

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
    static void CuboidCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        double length = input.nextDouble();
        System.out.print("Enter width");
        double width = input.nextDouble();
        System.out.print("Enter height");
        double height = input.nextDouble();
        double volume = length * width * height;
        double surfaceArea = 2 * ((length * width) + (length * height) + (width * height));

        System.out.printf("Volume: %.2f cubic units\n", volume);
        System.out.printf("Total Surface Area: %.2f square units\n", surfaceArea);
        input.close();
    }


                public static void  Sphere(){
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();

                double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

                System.out.println("\n=== Sphere Calculations ===");
                System.out.printf("Radius: %.2f%n", radius);
                System.out.printf("Volume: %.4f cubic units%n", volume);
                System.out.printf("Total Surface Area: %.4f square units%n", surfaceArea);

                scanner.close();



    }
    static void EvenOddCounter(){
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int number;
        String choice;

        System.out.println("=== Even/Odd Number Checker ===");
        System.out.println("Enter numbers to check if they are even or odd.");

        do {
            // Get input from user
            System.out.print("\nEnter a number: ");
            number = scanner.nextInt();

            // Check if number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
                evenCount++;
            } else {
                System.out.println(number + " is odd.");
                oddCount++;
            }

            // Ask if user wants to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));

        // Display final results
        System.out.println("\n=== Summary ===");
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total numbers entered: " + (evenCount + oddCount));

        scanner.close();
    }
}