package hws.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("In:");

        // Read the input string
        String response= scanner.nextLine();
        String reversed= "";

        // Use a for loop to reverse the string
        for (int i=response.length()-1; i>=0; i--){
            reversed +=response.charAt(i);
        }
        // Print the reversed string
        System.out.println(reversed);
        scanner.close();

    }
}
