import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        // Program to return the second last digit of a given number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int secondLastDigit = getSecondLastDigit(number);
        System.out.println("Second last digit: " + secondLastDigit);
        scanner.close();
    }

    static int getSecondLastDigit(int number) {
        if (number < 10 || number > -10) {
            return -1;
        }
        number = Math.abs(number);
        return (number / 10) % 10;
    }
}
