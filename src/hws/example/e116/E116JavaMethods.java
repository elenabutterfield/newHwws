package hws.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        System.out.println(bothEven(4,8));
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
    static boolean bothEven(int n1, int n2){
        return (n1%2==0)&&(n2%2==0);
    }
}
