package Module5.enumerations;

enum Days2 {
    mon, tue, wed;
}

public class Code1 {
    public static void main(String[] args) {
        Days2 qd = Days2.valueOf("wed");
        System.out.println("Index of " + qd + ": " + qd.ordinal());
        Days2 wd[] = Days2.values();
        for (Days2 w : wd) {
            System.out.println("Index of " + w + ": " + w.ordinal());
        }
    }
}

