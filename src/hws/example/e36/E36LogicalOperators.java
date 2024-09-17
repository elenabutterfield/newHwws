package hws.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to enter their monthly rent expense
        // Capture the rent expense input
        System.out.println(" enter your monthly rent expense ");
        double expense= scanner.nextDouble();
        // Print prompt for user to enter their monthly food expense
        // Capture the food expense input
        System.out.println(" enter your monthly food expense ");
        double foodExpense= scanner.nextDouble();

        // Print prompt for user to enter their monthly transportation expense
        // Capture the transportation expense input
        System.out.println(" enter your monthly transportation expense ");
        double transportationExpense= scanner.nextDouble();

        // Print prompt for user to enter their monthly entertainment expense
        // Capture the entertainment expense input
        System.out.println(" print your monthly entertainment expense ");
        double entertainmentExpense= scanner.nextDouble();

        if (expense>foodExpense && transportationExpense>entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");
        } else if (expense>foodExpense || transportationExpense>entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else if (expense<foodExpense && transportationExpense<entertainmentExpense) {
            System.out.println("You need to rethink your spending priorities.");
        }
    scanner.close();
    }
}
