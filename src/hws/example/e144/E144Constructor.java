package hws.example.e144;

public class E144Constructor {

    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public E144Constructor(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    public E144Constructor(String label, double price,int stock){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=stock;
    }
    public E144Constructor(String label,double price){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=0;
    }
    public void display(){
        System.out.println("label: "+label+" price: "+price+" category: "+category+" has expiration: "+hasExpiration+" stock: "+stock);
    }
    public static void main(String[] args) {
        E144Constructor storeProduct=new E144Constructor("Eggs", 3.0," Produce", true ,10);
        storeProduct.display();

        E144Constructor storeProduct1=new E144Constructor("Paper Towels", 2.0 ,"misc", false, 24);
        storeProduct1.display();

        E144Constructor storeProduct2=new E144Constructor("Paper Towels", 2.0 ,"misc", false ,0);
        storeProduct2.display();
    }
}
