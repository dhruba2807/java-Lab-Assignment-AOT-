import java.util.Scanner;

public class binarytooctal {
    public static void main(String[] args) {
        // Program to convert binary number to octal number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binaryNumber = scanner.nextLong();
        int octalNumber = convertBinaryToOctal(binaryNumber);
        System.out.println("Octal number: " + octalNumber);
       
    }
}