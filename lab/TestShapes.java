package lab;

// Shape.java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
    public void erase() {
        System.out.println("Erasing a shape.");
    }
}

// Circle.java
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
    public void erase() {
        System.out.println("Erasing a Circle.");
    }
}

// Triangle.java
class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
    public void erase() {
        System.out.println("Erasing a Triangle.");
    }
}

// Square.java
class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a Square.");
    }
    public void erase() {
        System.out.println("Erasing a Square.");
    }
}

// TestShapes.java
public class TestShapes {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = { new Circle(), new Triangle(), new Square() };

        // Demonstrate polymorphism
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}

