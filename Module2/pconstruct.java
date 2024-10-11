package Module2;

class pconstruct {
    double width;
    double height;
    double depth;

    pconstruct(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        pconstruct mybox1 = new pconstruct(10, 20, 15);
        pconstruct mybox2 = new pconstruct(3, 6, 9);
        double vol1,vol2;
        vol1 = mybox1.volume();
        System.out.println("Volume is " + vol1);
        vol2 = mybox2.volume();
        System.out.println("Volume is " + vol2);
    }
}