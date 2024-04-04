import java.util.Scanner;

public class java19{
    public static void main(String[] args) {
        // Program to display prime numbers from 1 to n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
