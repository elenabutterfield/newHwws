package hws.example.e123;

import org.w3c.dom.ls.LSOutput;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    private int myInt;
    private String myString;
    private double myDouble;
    private boolean myBoolean;
    private float myFloat;

    public void print(){
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myFloat);
    }

    public static void main(String[] args) {
     E123Variables instance=new E123Variables();
     instance.print();

        // Create an instance of the class
        // Access instance variables and print them without assigning any values
    }
    }

