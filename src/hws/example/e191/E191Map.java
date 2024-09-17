package hws.example.e191;

import java.util.LinkedHashMap;
import java.util.Map;

public class E191Map {

    public static void main(String[] args) {

        LinkedHashMap<String, Double>productNames=new LinkedHashMap<>();

        productNames.put("Laptop", 1200.99);
        productNames.put("Smartphone",799.99);
        productNames.put("Tablet",499.99);
        productNames.put("Smartwatch", 199.99);
        productNames.put("Headphones",149.99);

        for (Map.Entry<String, Double> entry: productNames.entrySet()){
            System.out.println(entry.getKey()+" =$"+entry.getValue());
        }



    }



}
