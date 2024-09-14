package hws.example.e164;

public class Car extends E164Vehicle{

    public void startEngine() {
        System.out.println("Car engine started");
    }
    public void startEngine(String keyType) {
        System.out.println("Car engine started with " + keyType);
    }
}
