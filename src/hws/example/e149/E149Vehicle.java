package hws.example.e149;

import hws.example.e87.Car;

public class E149Vehicle {

    private String make;
    private int year;

    public E149Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + make + ",Year: " + year);
    }
}








