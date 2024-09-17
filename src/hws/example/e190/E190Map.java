package hws.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {
        LinkedHashMap<String, String> addressDetails= new LinkedHashMap<>();

        addressDetails.put("Street", "Patrick ST");
        addressDetails.put("Suite", "265");
        addressDetails.put("City", "Vienna");
        addressDetails.put("Zip", "22180");
        addressDetails.put("Country", "United States");

        for (String value: addressDetails.values()){
            System.out.println(value);
        }
    }
}
