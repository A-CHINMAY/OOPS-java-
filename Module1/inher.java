package Module1;

class inher {
    int a = 10, b = 20;
}

class Second extends inher {
    public static void main(String[ ] args) { 
        Second obj=new Second( );  
        System.out.println(obj.a + obj.b); 
 }
}