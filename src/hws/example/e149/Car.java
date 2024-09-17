package hws.example.e149;

public class Car extends E149Vehicle {
    String model;


    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: "+model);
    }


    public static void main(String[] args) {
        Car myCar=new Car("Toyota",2020,"Corolla");
        myCar.displayCarInfo();
    }
}



