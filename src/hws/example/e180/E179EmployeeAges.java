package hws.example.e180;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class E179EmployeeAges {
    public static void main(String[] args) {
        LinkedList<Integer> age=new LinkedList<>();
        age.add(22);
        age.add(35);
        age.add(45);
        age.add(28);
        age.add(60);
        age.add(50);
        age.add(65);
        age.add(30);
        age.add(40);
        age.add(55);

        Iterator<Integer> iterator= age.iterator();
        while(iterator.hasNext()){
            int ages=iterator.next();
            if(ages<25||ages>60){
                iterator.remove();
            }
        }
        Collections.sort(age);
        int sum=0;
        for(int ages: age){
            sum+=ages;
        }
        double averageAge = (double) sum / age.size();

        System.out.println(age);
        System.out.println(averageAge);

    }
}
