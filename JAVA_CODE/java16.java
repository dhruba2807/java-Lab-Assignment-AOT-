import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        // Program to find sum of n natural numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}
