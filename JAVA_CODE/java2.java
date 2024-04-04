import java.util.Scanner;

public class java2{
    public static void main(String[] args) {
        // Program to print college name taken from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter college name: ");
        String college = scanner.nextLine();
        System.out.println("College Name: " + college);
        scanner.close();
    }
}
