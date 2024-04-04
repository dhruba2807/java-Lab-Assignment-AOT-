import java.util.Scanner;

public class FunMathematicalOperation {
    public static void main(String[] args) {
        // Program to perform a fun mathematical operation using loops
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number > 9) {
            int result = 1;
            while (number > 0) {
                result *= number % 10;
                number /= 10;
            }
            System.out.println("Intermediate result: " + result);
            number = result;
        }
        System.out.println("Final result: " + number);
        scanner.close();
    }
}
