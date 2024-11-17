package Module3;

import mypack.Message;
public class Mypack {
    public static void main(String[] args) {
        Message obj = new Message();
        obj.display();
    }
}

public class Message {
    public void display() {
        System.out.println("hello package");
    }
}
