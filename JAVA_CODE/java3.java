import java.util.Scanner;

public class java3{
    public static void main(String[] args) {
        // Program to print student name and college name from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter college name: ");
        String college = scanner.nextLine();
        System.out.println(name + " is a BTECH student of " + college + " college.");
        scanner.close();
    }
}
