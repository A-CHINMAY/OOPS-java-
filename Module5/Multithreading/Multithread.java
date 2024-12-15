package Module5.Multithreading;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Handling an exception
            System.out.println("Exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Creating 5 threads
            MultithreadingDemo object = new MultithreadingDemo();
            object.start(); // Start each thread
        }
    }
}
