package hws.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178GroceryList {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 grocery items");
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            groceries.add(scanner.nextLine());
        }
        ArrayList<String> uniqueItems = new ArrayList<>();
        for (String item : groceries) {
            if (!uniqueItems.contains(item)) {
                uniqueItems.add(item);
            }
        }
        System.out.println("Unique grocery items:");
        for (String item : uniqueItems) {
            System.out.print(item + " ");
        }
    }
}
