import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        // Program to convert long to int
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long number: ");
        long longNumber = scanner.nextLong();
        int intNumber = (int) longNumber; // Casting long to int
        System.out.println("The equivalent int value is: " + intNumber);
        scanner.close();
    }
}
