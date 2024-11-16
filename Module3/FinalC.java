package Module3;

final class A {
    void meth() {
        System.out.println("This is a final method.");
    }
}

class FinalC extends A {
    void meth() {
        System.out.println("Illegal!");
    }
}