package Module1;

class encap {
    private int a = 10;
}

class Second extends encap { 
    public static void main(String args[ ] ) { 
        Second obj = new Second( ); 
        System.out.println(obj.a);
    }
}
