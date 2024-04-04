class test {
    int x;

    void show() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.x = 10;
        obj.show();
    }
}
