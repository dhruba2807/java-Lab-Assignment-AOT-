class Student {
    int rollNo;
    String name;
    String stream;
    String college;

    public Student(int rollNo, String name, String stream, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.stream = stream;
        this.college = college;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
    }
}

public class stuent_class{
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Science", "XYZ College");
        Student student2 = new Student(2, "Alice", "Commerce", "ABC College");

        student1.display();
        System.out.println();
        student2.display();
    }
}
