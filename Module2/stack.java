package Module2;

class Stackop {
    int stck[] = new int[10];
    int top;
    Stackop() {
        top = -1;
    }
    void push(int item) {
        if (top == 9)
            System.out.println("Stack is full.");
        else
            stck[++top] = item;
    }
    int pop() {

        if (top < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[top--];
        }
    }

}

class stack{
public static void main(String args[]) {
        Stackop ob = new Stackop();
        for (int i = 0; i <= 10; i++)
            ob.push(i);
        ob.pop();
    }
}
