import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        // Program to convert price in decimal form to paise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price in decimal form: ");
        double price = scanner.nextDouble();
        int paise = (int) (price * 100);
        System.out.println("Price in paise: " + paise + " paise");
        scanner.close();
    }
}
