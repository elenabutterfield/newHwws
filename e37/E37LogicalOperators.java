package hws.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to answer if they are thirsty
        // Capture the thirsty input
        System.out.println(" are you thirsty? true/false");
        boolean thirsty= scanner.nextBoolean();
        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input
        System.out.println("are you sleepy? true/false");
         boolean sleepy= scanner.nextBoolean();

        // Determine the drink based on the inputs
        if (thirsty && !sleepy){
            System.out.println("drink water");
        } else if (thirsty && sleepy) {
            System.out.println("drink coffee");
        } else if (!thirsty && sleepy) {
            System.out.println("drink tea");
        }else {
            System.out.println("drink nothing");
        }
scanner.close();
        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
