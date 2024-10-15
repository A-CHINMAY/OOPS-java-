package Module2;

class garbage {
    // Overriding the finalize() method
    protected void finalize() {
        System.out.println("Object memory deallocated");
    }
    public static void main(String[] args) {
        garbage obj1 = new garbage();
        obj1 = null; // Eligible for garbage collection
        // Requesting JVM for garbage collection
        System.gc();
        // Creating another object and making it eligible for garbage collection
        new garbage();
        // Requesting JVM for garbage collection again
        System.gc();
    }
}