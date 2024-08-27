package hws.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
        add(10,20);
        // Call the multiply method with arguments that multiply to 30
        multiply(5,6);
        // Call the subtract method with arguments that subtract to 20
        subtract(30,10);
    }

    // Create method multiply with two integer parameters and a print statement to display the result
   static void multiply(int num1, int num2){
        int result = num1*num2;
       System.out.println("Multiplication result: " + result);
   }

    // Create method add with two integer parameters and a print statement to display the result
    static void add(int num1, int num2){
        int result =num1+num2;
        System.out.println("addition result: "+result);
    }

    // Create method subtract with two integer parameters and a print statement to display the result
     static void subtract(int num1, int num2 ){
        int result =num1-num2;
         System.out.println("Subtraction result: "+result);
     }
}
