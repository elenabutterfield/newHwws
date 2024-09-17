package hws.example.e34;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner =new Scanner(System.in);
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("enter 3 distinct numbers");
        // Capture the three numbers input
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();

        // Use nested if-else statements to find the largest number
        if (n1>=n2){
            if(n1>=n3){
                System.out.println(n1+ " largest");
            }else{
                System.out.println(n3+ " largest");
            }
        }else{
            if(n2>=n3){
                System.out.println(n2+ " largest");
            }else{
                System.out.println(n2+ " largest");
            }
        }
        scanner.close();
    }
}
