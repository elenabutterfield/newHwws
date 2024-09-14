package hws.example.e148;

public class E148ShoppingStore {

    private String item;
    private double price;
    private int quantity;

    public E148ShoppingStore(String item, double price, int quantity){

        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }
    public void itemTotalPrice(){
        double totalValue=price*quantity;
        System.out.println("Item total value "+totalValue);

    }
    public static void main(String[] args){
        E148ShoppingStore value=new E148ShoppingStore("Blanket", 49.99, 2);
        value.itemTotalPrice();

        E148ShoppingStore value2=new E148ShoppingStore("Mattress",219.59, 2);
        value2.itemTotalPrice();

    }
}
   