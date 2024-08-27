package hws.example.e121;

import hws.example.e120.E120Variables;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    private int age;
    private double weight;
    private char gender;

    public E121Variables(int age, double weight, char gender){
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }
    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
        E121Variables var=new E121Variables( 30, 125.0,'F');
        E121Variables var1=new E121Variables(47, 150.0, 'F');

        System.out.println(var.age);
        System.out.println(var.weight);
        System.out.println(var.gender);

        System.out.println(var1.age);
        System.out.println(var1.weight);
        System.out.println(var1.gender);
    }
}
