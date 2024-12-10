package Module5.enumerations;

enum Days4 {
    mon, tue, wed;
}

public class Code3 {
    public static void main(String args[]) {
        Days4 d1, d2, d3;
        d1 = Days4.mon;
        d2 = Days4.tue;
        d3 = Days4.wed;

        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d2.equals(d2));
    }
}