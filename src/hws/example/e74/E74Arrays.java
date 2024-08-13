package hws.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("Result:");
        for (int i = 0; i < array.length; i++) {
            int multipliedValue = array[i] * 10;
            System.out.println(multipliedValue);
        }


        // Create an array of integers with a size of 5
        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)

        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
