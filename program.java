//Write a Java program that inputs the length and width of a rectangle and calculates and prints the
//perimeter and area.

import java.io.*;
import java.util.Scanner;

<<<<<<< HEAD
class program {
    public static void main(String[] args ) {

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
=======
public class Rectangle {
    public static void main(String[] args) {
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
>>>>>>> 428ee1c0aab979de3934e75280a0467dfa782d93
    }
}