package lab;

class MyPoint {

    private int x;
    private int y;


    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[] { x, y };
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }
}

public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        System.out.println("Default point: " + p1); 

        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point p2: " + p2); // Should print (3, 4)
    
        p1.setXY(1, 2);
        System.out.println("Point p1 after setXY(1, 2): " + p1); // Should print (1, 2)

        int[] coords = p1.getXY();
        System.out.println("Coordinates of p1: (" + coords[0] + ", " + coords[1] + ")");

        System.out.println("Distance from p1 to p2: " + p1.distance(p2));

        System.out.println("Distance from p1 to (5, 6): " + p1.distance(5, 6));

        System.out.println("Distance from p1 to the origin: " + p1.distance());
    }
}