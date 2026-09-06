//Write a Java program that inputs the length and width of a rectangle and calculates and prints the
//perimeter and area.

import java.io.*;
import java.util.Scanner;

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
    }
}