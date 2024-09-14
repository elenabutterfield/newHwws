package hws.example.e179;

import java.util.Iterator;
import java.util.LinkedList;

public class E179LinkedListDivisibility {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 3 != 0) {
                iterator.remove();
            }
        }
        System.out.println("Numbers divisible by 3:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}