class Test1 {
    int x;

    void show() {
        System.out.println("Value of x: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.x = 20;
        obj.show();
    }
}
