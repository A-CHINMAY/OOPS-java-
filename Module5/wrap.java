package Module5;

class wrap {
    @SuppressWarnings("removal")
    public static void main(String args[]) {
        Character c = new Character('@');
        char c1 = c.charValue();
        System.out.println("Character wrapper class " + c1);
        Boolean b = new Boolean(true);
        boolean b1 = b.booleanValue();
        System.out.println("Boolean wrapper class " + b1);
        Integer i1 = new Integer(100);
        int i = i1.intValue();
        System.out.println("Integer wrapper class " + i);
        Float f1 = new Float(12.5);
        float f = f1.floatValue();
        System.out.println("Float wrapper class " + f);
    }
}