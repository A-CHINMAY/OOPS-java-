package Module5;

enum Colors {
    RED,
    BLUE,
    YELLOW,
    GREEN;
}

public class Enum {
    public static void main(String[] args) {
        Colors red = Colors.RED; //dot operator 
        System.out.println(red); //prints value
        System.out.println(red.ordinal()); //gives index no
    }
    
}
