package Module5.Multithreading;


class first extends Thread {
    public void run() {
        System.out.println("Thread started ..");
    }
}

public class ThreClass {
    public static void main(String[] args) {
        first t1 = new first();
        t1.start();
    }
}