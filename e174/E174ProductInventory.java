package hws.example.e174;

import java.util.ArrayList;

public class E174ProductInventory {
    public static void main(String[] args) {
        ArrayList<Integer> productId =new ArrayList<>();
        productId.add(1011);
        productId.add(1022);
        productId.add(1033);
        productId.add(1044);
        productId.add(1055);
        productId.add(1066);

        System.out.println(productId.get(0));
        System.out.println(productId.get(2));
        System.out.println(productId.get(4));
    }
}
