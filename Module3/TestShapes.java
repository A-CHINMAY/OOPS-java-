package Module3;

class Shape {
    // Method to draw a shape
    public void draw() {
        System.out.println("Drawing a shape.");
    }

    // Method to erase a shape
    public void erase() {
        System.out.println("Erasing a shape.");
    }
}

// Circle.java
class Circle extends Shape {
    // Override draw method for Circle
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    // Override erase method for Circle
    public void erase() {
        System.out.println("Erasing a Circle.");
    }
}

// Triangle.java
class Triangle extends Shape {
    // Override draw method for Triangle
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }

    // Override erase method for Triangle
    public void erase() {
        System.out.println("Erasing a Triangle.");
    }
}

// Square.java
class Square extends Shape {
    // Override draw method for Square
    public void draw() {
        System.out.println("Drawing a Square.");
    }

    // Override erase method for Square
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
