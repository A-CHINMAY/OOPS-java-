package lab;

public class CusExcep{
    public static void main(String[] args) {
        try{
            int r = divideNumber(10,0);
            System.out.println("result: " + r);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static int divideNumber(int divident,int divisor) throws Exception {
        if (divisor == 0){
            throw new Exception("division by zero");
        }
        return divisor;
    }
}

