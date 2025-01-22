package Module5.Multithreading;

class first implements Runnable {
    public void run() {
        System.out.println("Thread started ..");
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        first obj = new first();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}