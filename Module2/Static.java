package Module2;

class Static {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String args[]) {
        Static.callme();// no object is needed for static
        System.out.println("b = " + Static.b);
    }
}