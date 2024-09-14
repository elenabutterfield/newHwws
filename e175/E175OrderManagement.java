package hws.example.e175;

import java.util.ArrayList;

public class E175OrderManagement {
    public static void main(String[] args) {
        ArrayList<Integer> products=new ArrayList<>();
        products.add(111);
        products.add(111);
        products.add(111);

        products.add(999);
        products.add(999);
        products.add(999);

        for(Integer quantity:products){
            System.out.println(quantity);
        }

    }
}
