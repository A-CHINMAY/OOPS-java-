package Module5;

public class Boxing {
    @SuppressWarnings({ "removal", "unused" })
    public static void main(String[] args) {

        // boxing
        int num = 10;
        Integer num1 = Integer.valueOf(num);

        System.out.println(num1); //10

        // unboxing
        Integer a = new Integer(8);
        int b = a.intValue();

        System.out.println(b);

        Character obj = new Character('a');
        char obj1 = obj.charValue();


    }
}