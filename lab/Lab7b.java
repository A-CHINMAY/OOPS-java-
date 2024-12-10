package lab;

class myThread extends Thread {
    myThread(String name) {
        super.setName(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(250);
                System.out.println("Running Child Thread: " + super.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Lab7b {
    public static void main(String[] args) {
        myThread t = new myThread("UwU");
        t.start();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.println("Running Main Thread.....");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}