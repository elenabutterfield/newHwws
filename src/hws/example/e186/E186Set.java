package hws.example.e186;

import java.util.HashSet;

public class E186Set {
    public static void main(String[] args) {
        HashSet<String> taskNames = new HashSet<>();
        taskNames.add("third");
        taskNames.add("first");
        taskNames.add("second");

        System.out.println("Task Names in HashSet:");
        for (String task : taskNames) {
            System.out.println(task);
        }

            taskNames.clear();
            System.out.println("Task Names after clearing the HashSet: " + taskNames);
        }
    }


