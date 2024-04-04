import java.util.Scanner;

public class java13{
    public static void main(String[] args) {
        // Program to reverse an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
