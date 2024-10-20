package Module2;

class AccessModifiers {
    public String publicVar = "Public";
    private String privateVar = "Private";
    protected String protectedVar = "Protected";

    public String getPrivateVar() {
        return privateVar;
    }
}

public class Access {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.publicVar); // Accessible
        System.out.println(obj.getPrivateVar()); // Accessible through public method
        System.out.println(obj.protectedVar); // Not accessible here, but accessible in subclass
    }
}
