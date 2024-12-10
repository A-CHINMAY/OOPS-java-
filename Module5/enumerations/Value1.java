package Module5.enumerations;

enum Days {
    mon, tue, wed, thu, fri, sat, sun;
}

public class Value1 {
    public static void main(String[] args) {
        Days d[] = Days.values();
        for (Days d1 : d)
            System.out.println("today day is:" + d1);
    }
}

