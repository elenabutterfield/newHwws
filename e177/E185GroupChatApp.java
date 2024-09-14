package hws.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E185GroupChatApp {
    public static void main(String[] args) {
        ArrayList<String> messages=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 chat messages");
        for (int i=0; i<5; i++){
            messages.add(scanner.nextLine());
        }
        messages.remove(4);
        messages.remove(2);
        messages.remove(0);


        for(String message: messages){
            System.out.println(message+" ");
        }

    }
}
