package hws.example.e185;

import java.util.HashSet;

public class E185CustomerOrdersHashSet {

    public static void main(String[] args) {
        HashSet<Integer> customerIDs = new HashSet<>();
        int[] orders = {1001, 1002, 1001, 1003, 1002, 1004};
        for (int id : orders) {
            customerIDs.add(id);
        }
        for (int id : customerIDs){
            System.out.println(id);
        }
    }
}
