package hws.example.e154;

public class WashingMachine extends E154Appliance{

    public WashingMachine() {
        System.out.println("WashingMachine Constructor without argument");
    }
    public WashingMachine(int wattage, int capacity) {
        super(wattage);
        System.out.println("Capacity: " + capacity);
    }

}
