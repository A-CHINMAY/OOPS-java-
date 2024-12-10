package lab;

class timer implements Runnable {
    public void run() {
        try {
            for (double i = 0; i <= 10; i += 0.5) {
                System.err.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

public class thread {
    public static void main(String[] args) {
        timer t = new timer();
        Thread t0 = new Thread(t);
        t0.start();
    }
}