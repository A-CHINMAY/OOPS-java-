package Module2;

public class value {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class callbyvalue {
public static void main(String[] args)  
{
    value ob = new value();
    int a = 15, b = 20;

    System.out.println("a and b before call: " + a + "" + b);
    ob.meth(a, b);
    System.out.println("a and b after call: " + a + " " + b);
}
}
