import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
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