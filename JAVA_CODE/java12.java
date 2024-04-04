import java.util.Scanner;

public class java12{
    public static void main(String[] args) {
        // Program to find ASCII value of a character
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
        scanner.close();
    }
}
