package Module2;

class Student {
    String name;
    // Constructor using 'this' to refer to the instance variable
    Student(String name) {
        this.name = name;
    }
    // Method to display the student's name
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