import java.util.Scanner;

public class binarytooctal{
    public static void main(String[] args) {
        // Program to convert binary number to octal number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binaryNumber = scanner.nextLong();
        int octalNumber = convertBinaryToOctal(binaryNumber);
        System.out.println("Octal number: " + octalNumber);
        scanner.close();
    }

    static int convertBinaryToOctal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, count = 0;
        while (binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, count);
            ++count;
            binaryNumber /= 10;
        }
        count = 1;
        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * count;
            decimalNumber /= 8;
            count *= 10;
        }
        return octalNumber;
    }
}
