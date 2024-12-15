package Module5.Multithreading;

// Table class with synchronized method
class Table {
    synchronized void printTable(int n) {
        // Synchronized method to ensure thread safety
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400); // Simulate delay
            } catch (InterruptedException ie) {
                System.out.println("The Exception is: " + ie);
            }
        }
    }
}

// MyThread1 class extends Thread
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t; // Assigning the shared Table object
    }

    public void run() {
        t.printTable(5); // Calling the printTable method for table of 5
    }
}

// MyThread2 class extends Thread
class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t; // Assigning the shared Table object
    }

    public void run() {
        t.printTable(100); // Calling the printTable method for table of 100
    }
}

// TestSynchronization1 class to run the threads
public class Synchro {
    public static void main(String args[]) {
        Table obj = new Table(); // Creating a single Table object shared by threads

        MyThread1 t1 = new MyThread1(obj); // Creating MyThread1 with shared Table object
        MyThread2 t2 = new MyThread2(obj); // Creating MyThread2 with shared Table object

        t1.start(); // Starting the first thread
        t2.start(); // Starting the second thread
    }
}
