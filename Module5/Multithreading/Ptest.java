package Module5.Multithreading;

class PThread1 extends Thread {
    public void run() {
        System.out.println(" Child 1 is started");
    }
}

class PThread2 extends Thread {
    public void run() {
        System.out.println(" Child 2 is started");
    }
}

class PThread3 extends Thread {
    public void run() {
        System.out.println(" Child 3 is started");
    }
}

class PTest {
    public static void main(String args[]) {
        // setting the priorities to the thread using the setPriority() method
        PThread1 pt1 = new PThread1();
        pt1.setPriority(1);

        PThread2 pt2 = new PThread2();
        pt2.setPriority(9);

        PThread3 pt3 = new PThread3();
        pt3.setPriority(6);

        pt1.start();
        pt2.start();
        pt3.start();
      
        System.out.println("The pt1 thread priority is :" + pt1.getPriority());
    }
}
