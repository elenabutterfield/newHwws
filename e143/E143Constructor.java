package hws.example.e143;

import hws.example.e142.E142Constructor;
import hws.example.e87.Car;

public class E143Constructor {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public E143Constructor(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public E143Constructor(String make, String model, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this. price=price;
    }
    public E143Constructor(int numberOfDoors,int topSpeed,double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public E143Constructor(String make, String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Top Speed: " + topSpeed + " mph");
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        E143Constructor myCar = new E143Constructor ("Toyota", "Camry", 4, 120, 25000.0);
        myCar.display();

    }
}


