package Module3;

class A {
    final void meth() {
        System.out.println("This is a final method.");
    }
}
class FinalM extends A {
    void meth() {
        System.out.println("Illegal!");
    }
}
