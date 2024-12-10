package Module5;

enum Days1 {
    monday,
    tuesday;
}
public class ValueOf1 {
    public static void main(String[] args) {
        Days1 d = Days1.valueOf("wednesday");
        System.out.println("day selected is:" + d);
    }
}
