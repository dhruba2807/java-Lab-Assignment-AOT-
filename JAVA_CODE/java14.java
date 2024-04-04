import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        // Program to print Fibonacci series
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close();
    }
}
