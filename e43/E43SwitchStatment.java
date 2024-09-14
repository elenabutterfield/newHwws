package hws.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);

        // Print prompt for user to enter their electricity usage in kWh
        System.out.println( "Enter your electricity usage in kWh");
        // Capture the usage input
        int usage= scanner.nextInt();
        double bill=0.0;
        boolean validUsage=true;

        if (usage <0){
            System.out.println("Invalid usage entered");
            validUsage=false;
        }else{
            switch (usage/100){
                case 0:
                    bill=usage*0.12;
                    break;
                case 1:
                    bill=usage*0.15;
                    break;
                case 2:
                    bill=usage*0.20;
                    break;
                default:
                    bill=usage*0.25;
                    break;
            }
        // Calculate bill using switch statement

        }
        if(validUsage){
            System.out.println("Your electricity bill is $"+bill);
        }

        // Print the bill
        // Output: Your electricity bill is $____

    }
}
