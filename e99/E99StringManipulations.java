package hws.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String response= scanner.nextLine();

        // Remove all spaces and convert the string to lowercase
        String response1= response.replaceAll(" ","").toLowerCase();
        System.out.println(response1);

        // Check if the string is a palindrome
        String reversed= new StringBuilder(response1).reverse().toString();
        if(response1.equals(reversed)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
scanner.close();

        // Print "true" if the string is a palindrome, and "false" otherwise
    }
}
