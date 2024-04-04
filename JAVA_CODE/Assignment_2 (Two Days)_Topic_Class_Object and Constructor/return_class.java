class MyClass {
    MyClass getObject() {
        return this; // returning object of the same class
    }
}

public class return_class
{
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = obj1.getObject(); // Getting reference of obj1
        System.out.println(obj1 == obj2); // This will print true
    }
}
