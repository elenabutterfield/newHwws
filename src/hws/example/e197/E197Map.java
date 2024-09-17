package hws.example.e197;


import java.util.HashMap;
import java.util.Map;

public class E197Map {

    public static void main(String[] args) {
            Map<Integer, Dog> dogMap = new HashMap<>();

            Dog dog1 = new Dog("Max", "Labrador", 5);
            Dog dog2 = new Dog("Bella", "Beagle", 3);
            Dog dog3 = new Dog("Rocky", "Bulldog", 4);

            dogMap.put(1, dog1);
            dogMap.put(2, dog2);
            dogMap.put(3, dog3);

        for (Map.Entry<Integer, Dog> entry : dogMap.entrySet()) {
            System.out.println("Dog ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
    }


