package hws.example.e136;

public class E136AccessModifiers {
    private static void privateMethod(){
        System.out.println("This is private method");
    }
    static void defaultMethod(){
        System.out.println("This is default method");
    }
    protected static void protectedMethod(){
        System.out.println("This is protected method");
    }
    public static void publicMethod(){
        System.out.println("This is public method");
    }

    public static void main(String[] args) {
    privateMethod();
    defaultMethod();
    protectedMethod();
    publicMethod();
    }
}


