package hws.example.e147;

public class E147CarObject {
    private String model;
    private double price;
    private int quantity;

    public E147CarObject(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
     public void carStockValue(){
        double totalValue=price*quantity;
         System.out.println(model+" Stock value "+totalValue);
     }

    public static void main(String[] args) {
        E147CarObject car=new E147CarObject("Toyota 2019", 50000.0, 50);
        car.carStockValue();

        E147CarObject car1=new E147CarObject("BMW 2019",10883.0, 60);
        car1.carStockValue();


    }
}
