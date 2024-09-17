package hws.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {

        HashSet<String> colorNames=new HashSet<>();
        colorNames.add("red");
        colorNames.add("pink");
        colorNames.add("yellow");
        colorNames.add("white");
        colorNames.add("black");

        System.out.println("Original color collection:"+colorNames);


        System.out.println("Size: "+colorNames.size());
    }

}
