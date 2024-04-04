import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
        // Program to print the nth Fibonacci number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        int nthFibonacci = 0;
        for (int i = 2; i <= n; i++) {
            nthFibonacci = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nthFibonacci;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
        scanner.close();
    }
}
