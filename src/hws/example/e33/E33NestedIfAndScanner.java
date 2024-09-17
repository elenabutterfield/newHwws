package hws.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter a number
        // Capture the number input
        System.out.println("enter a number");
        int number = scanner.nextInt();

        // Classify the number
        // Use an if-else statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
         if (number > 1000) {
            System.out.println("large");
        } else {
            System.out.println("right");
        }

    }

        // Create a Scanner object to read input from the console

    }

