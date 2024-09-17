package hws.example.e195;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E195Map {

    public static void main(String[] args) {
        // Create a Map to store students grouped by subject
        Map<String, List<String>> studentsBySubject = new HashMap<>();

        studentsBySubject.put("Mathematics", Arrays.asList("Alice", "Bob"));
        studentsBySubject.put("Science", Arrays.asList("Charlie", "David"));
        studentsBySubject.put("History", Arrays.asList("Eve", "Frank"));

        System.out.println("Students grouped by subjects:");
        for (Map.Entry<String, List<String>> entry : studentsBySubject.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Students: " + entry.getValue());
        }
    }
    }
