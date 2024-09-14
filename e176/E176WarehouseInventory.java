package hws.example.e176;

import java.util.ArrayList;

public class E176WarehouseInventory {
    public static void main(String[] args) {
        ArrayList<Integer> productIds=new ArrayList<>();
        productIds.add(111);
        productIds.add(222);
        productIds.add(333);
        productIds.add(444);
        productIds.add(555);
        productIds.add(666);

        System.out.println(productIds);

        productIds.clear();

        System.out.println(productIds);

    }
}
