package Module2;

public class obCla {
    double width;
    double height;
    double depth;
}

class boxdemo1 {
    public static void main(String[] args) {
        obCla mybox = new obCla();
        mybox.width = 10;
        mybox.height = 10;
        mybox.depth = 15;
        double vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("volume is " + vol);
    }
}