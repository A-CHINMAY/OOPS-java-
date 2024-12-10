package lab;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeinght(int height); 
}

class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width){
        this.width = width;
    }
    
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printSize(){
        System.out.println("width:" + width + "height:" + height);
    }
}

public class InResizable {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(100, 150);
        obj.printSize();
        obj.resizeHeight(250);
        obj.resizeWidth(100);
        obj.printSize();
    }
    
}
