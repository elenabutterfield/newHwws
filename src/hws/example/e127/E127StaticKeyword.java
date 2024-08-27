package hws.example.e127;

public class E127StaticKeyword {

    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        E127StaticKeyword obj=new E127StaticKeyword();
        // Call the non-static method using the instance
        obj.nonStaticMethod();
        // Call the static method using the class name
        E127StaticKeyword.staticMethod();
    }

    // Create a non-static method to print "Programming is amazing."
    public void nonStaticMethod(){
        System.out.println("Programming is amazing");
    }

    // Create a static method to print "Java is awesome."
    public static void staticMethod(){
        System.out.println("Java is awesome");
    }
}
