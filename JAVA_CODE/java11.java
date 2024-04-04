import java.util.Scanner;

public class java11{
    public static void main(String[] args) {
        // Program to multiply a number by 2 and divide the same number by 4 using shift operator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int multipliedByTwo = number << 1;
        int dividedByFour = number >> 2;
        System.out.println("Number multiplied by 2: " + multipliedByTwo);
        System.out.println("Number divided by 4: " + dividedByFour);
        scanner.close();
    }
}
