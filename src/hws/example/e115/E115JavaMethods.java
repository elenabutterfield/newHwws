package hws.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        String original="test";
        String upperCase= convertToUpper(original);
        System.out.println(upperCase);
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
    static String convertToUpper(String input){
    return input.toUpperCase();

    }
}
