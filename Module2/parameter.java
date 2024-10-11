package Module2;

class obparam {
    int a, b;
    obparam(int i, int j) {
        a = i;
        b = j;
    }
    boolean equals(obparam o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

public class parameter {
    public static void main(String[] args) {

        obparam ob1 = new obparam(10, 20);
        obparam ob2 = new obparam(10, 20);
        obparam ob3 = new obparam(-1, -1);
        System.out.println("ob1==ob2" + ob1.equals(ob2));
        System.out.println("ob1==ob3" + ob1.equals(ob3));
    }

}