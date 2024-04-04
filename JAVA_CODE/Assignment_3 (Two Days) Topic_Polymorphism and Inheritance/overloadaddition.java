public class OverloadAddition {
    // Method to add two integers
    static int addition(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    static double addition(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two integers: " + addition(5, 3));
        System.out.println("Addition of three integers: " + addition(5, 3, 2));
        System.out.println("Addition of two doubles: " + addition(2.5, 3.7));
    }
}
