import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Program to calculate Simple Interest
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle amount (in Rs): ");
        double principle = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Enter rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        
        double simpleInterest = (principle * time * rate) / 100;
        System.out.println("Simple Interest: Rs " + simpleInterest);
        
        scanner.close();
    }
}
