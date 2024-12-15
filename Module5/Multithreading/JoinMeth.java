package Module5.Multithreading;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                // Sleeping the thread for 300 milliseconds
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
        // Creating a Runnable object
        MyRunnable myRunnable = new MyRunnable();

        // Creating 3 threads and passing the Runnable object to each
        Thread th1 = new Thread(myRunnable);
        Thread th2 = new Thread(myRunnable);
        Thread th3 = new Thread(myRunnable);

        th1.start(); // Start thread th1
        try {
            th1.join(); // Wait for thread th1 to finish before starting th2
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e);
        }

        th2.start(); // Start thread th2
        try {
            th2.join(); // Wait for thread th2 to finish before starting th3
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e);
        }

        th3.start(); // Start thread th3
    }
}
