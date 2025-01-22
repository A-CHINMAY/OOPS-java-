package Module5.Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Exception caught: " + e);
            }
            System.out.println("Value of i: " + i);
        }
    }
}

public class JoinMeth {
    public static void main(String[] args) {
     
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e);
        }

        th2.start(); 
        try {
            th2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e);
        }

        th3.start(); 
    }
}

