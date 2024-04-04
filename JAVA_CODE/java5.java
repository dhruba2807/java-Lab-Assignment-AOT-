import java.util.Scanner;

public class java5{
    public static void main(String[] args) {
        // Program to convert temperature from Fahrenheit to Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius + " °C");
        scanner.close();
    }
}
