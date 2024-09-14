package hws.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class
        StringBuffer sb= new StringBuffer("Hello");
        sb.append(" World");

        // Append the value "Hello" to the StringBuffer

        // Append the value "World" to the StringBuffer

        // Convert the StringBuffer content to uppercase and print it
        String upperCase= sb.toString().toUpperCase();
        System.out.println(upperCase);

    }
}
