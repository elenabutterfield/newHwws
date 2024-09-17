package hws.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);

        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input
        System.out.println("Do you need a loan? true/false");
        boolean needsLoan= scanner.nextBoolean();
        // Check if the user needs a loan
        if( needsLoan==true){
            System.out.println("What is your credit score?");
            int creditScore= scanner.nextInt();
            if ( creditScore< 600){
                System.out.println("not eligible");
            } else if (creditScore>600 && creditScore<=700) {
                System.out.println("maybe");
            } else if (creditScore >701 && creditScore<=800) {
                System.out.println("eligible");
            }else {
                System.out.println(" definitely");
            }
        }if(needsLoan==false){
            System.out.println("unknown");
        }
scanner.close();






    }
}
