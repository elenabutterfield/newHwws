package hws.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        Scanner scanner = new Scanner(System.in);
        // Declare a boolean variable isSunny
        // Print "Is it sunny outside? (true/false)"

        System.out.println("Is it sunny outside? (true/false)");
        boolean isSunny = scanner.nextBoolean();
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
        }
        // Capture the user's input and store it in isSunny
        // Declare an integer variable temperature
        int temperature = scanner.nextInt();

        // Use an if-else statement to check if it is sunny
        if (temperature > 85) {
            System.out.println("I am going to the beach");
        }else{
            System.out.println("I am going to the park");
        }


    }
    }
