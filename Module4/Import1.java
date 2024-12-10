package Module4;

//package mypack1; //save One.java in the package mypack1 
class One {
    public void display() {
        System.out.println("Hello Java  from mypack1");
    }
}

// package mypack2; //save Two.java in the package mypack2
// import mypack1.*; //importing mypack1 all classes, interfaces ect.,
public class Import1 {
    public static void main(String[] args) {
        One obj = new One();
        obj.display();
    }
}