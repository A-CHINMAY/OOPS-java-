package Module2;

class construct {
    double width;
    double height;
    double depth;

    construct() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        construct mybox1 = new construct();
        construct mybox2 = new construct();
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}