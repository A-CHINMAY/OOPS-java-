package lab;

//package mypack;
class Message{
    public void display(){
        System.out.println("hello package");
    }
}

//import mypack.Message
public class MyPack {
    public static void main(String[] args) {
        Message obj = new Message();
        obj.display();
    }
}
