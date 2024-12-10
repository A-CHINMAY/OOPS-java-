package lab;

import java.util.Scanner;

public class Stack {
    private int SIZE = 3, Array[], top;

    public Stack() {
        Array = new int[SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < SIZE - 1) {
            Array[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow! Cannot push " + value + ".");
        }
    }

    public int pop() {
        if (top >= 0) {
            int pValue = Array[top--];
            System.out.println("Popped: " + pValue);
            return pValue;
        } else {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("Stack Contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(Array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int choice;
        for(;;){
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack Contents");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}