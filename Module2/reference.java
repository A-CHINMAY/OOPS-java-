package Module2;

class test1 {
    int a, b;
    test1(int i, int j){
        a = i;
        b = j;
    }

    void meth(test1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class reference {

    public static void main(String[] args) {
        test1 ob = new test1(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }

}