package Module5.enumerations;

enum Days3 {
    mon, tue, wed;
}

public class Code2 {
    public static void main(String args[]) {
        Days3 d1, d2, d3;
        d1 = Days3.mon;
        d2 = Days3.tue;
        d3 = Days3.wed;

        if (d1.compareTo(d2) > 0)
            System.out.println("mon comes after tue");
        if (d2.compareTo(d3) > 0)
            System.out.println("tue comes after wed");
        if (d3.compareTo(d2) > 0)
            System.out.println("wed comes after tue");
    }
}
