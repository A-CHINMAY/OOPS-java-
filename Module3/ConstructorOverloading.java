package Module3;

class Student {
    String name;
    int age;
    String grade;

    // Constructor 1: No arguments
    Student() {
        name = "Unknown";
        age = 0;
        grade = "Not assigned";
    }

    // Constructor 2: With name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = "Not assigned";
    }

    // Constructor 3: With name, age, and grade
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using different constructors
        Student student1 = new Student(); // No-argument constructor
        Student student2 = new Student("Alice", 20); // Constructor with name and age
        Student student3 = new Student("Bob", 22, "A+"); // Constructor with name, age, and grade

        // Display student details
        student1.display();
        student2.display();
        student3.display();
    }
}
