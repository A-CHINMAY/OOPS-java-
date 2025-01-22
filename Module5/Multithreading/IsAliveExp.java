package Module5.Multithreading;

public class IsAliveExp extends Thread {

    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("thread is running now");
        } catch (InterruptedException ie) {
        }
    }

    public static void main(String[] args) {
        IsAliveExp t1 = new IsAliveExp();
        System.out.println("before starting thread isAlive: " + t1.isAlive());
        t1.start();
        System.out.println("after starting thread isAlive: " + t1.isAlive());
    }
}