package hws.example.e192;

import java.util.Map;
import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){

        TreeMap<String, String> productDetails= new TreeMap<>();
        productDetails.put("1 item", "apple");
        productDetails.put("2 item", "banana");
        productDetails.put("3 item", "pear");
        productDetails.put("4 item", "tomato");
        productDetails.put("5 item", "mango");
        productDetails.put("6 item", "kiwi");

        for (Map.Entry<String, String> entry : productDetails.entrySet()) {
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }
    }

    }

