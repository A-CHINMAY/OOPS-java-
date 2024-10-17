package Module2;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student name: " + this.name);
    }
}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.display();
    }
}