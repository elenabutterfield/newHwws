package hws.example.e193;


import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {
        HashMap<Integer, String> libraryCatalog =new HashMap<>();

        libraryCatalog.put(101, "The Catcher in the Rye");
        libraryCatalog.put(102, "To Kill a Mockingbird");
        libraryCatalog.put(103, "1984");
        libraryCatalog.put(104, "The Great Gatsby");
        libraryCatalog.put(105, "Moby Dick");

        System.out.println("Number of books in the catalog: " + libraryCatalog.size());
        System.out.println("Is the catalog empty? " + libraryCatalog.isEmpty());
        System.out.println("Is 'To Kill a Mockingbird' available? " + libraryCatalog.containsKey(102));
        System.out.println("Is '1984' available? " + libraryCatalog.containsValue("1984"));
        libraryCatalog.remove(105);
        System.out.println("Updated catalog after removing 'Moby Dick': " + libraryCatalog);
        libraryCatalog.clear();
        System.out.println("Is the catalog empty after clearing? " + libraryCatalog.isEmpty());


    }

}
