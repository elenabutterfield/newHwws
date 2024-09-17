package hws.example.e173;

import java.util.ArrayList;

public class E173TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks=new ArrayList<>();
        System.out.println(tasks.isEmpty());
        tasks.add("Buy groceries");
        System.out.println(tasks.isEmpty());
    }
}
