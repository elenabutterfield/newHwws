package hws.example.e196;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E196Map {

    public static void main(String[] args) {

        Map<String, List<String>> departmentEmployees = new HashMap<>();

        List<String> hrEmployees = new ArrayList<>();
        List<String> itEmployees = new ArrayList<>();
        List<String> financeEmployees = new ArrayList<>();

        hrEmployees.add("Alice");
        hrEmployees.add("Bob");

        itEmployees.add("Charlie");
        itEmployees.add("David");
        itEmployees.add("Eve");

        financeEmployees.add("Frank");
        financeEmployees.add("Grace");

        departmentEmployees.put("HR", hrEmployees);
        departmentEmployees.put("IT", itEmployees);
        departmentEmployees.put("Finance", financeEmployees);

        System.out.println("Department and Employees:");
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            System.out.println("Department: " + entry.getKey() + " Employees: " + entry.getValue());

        }
    }
}