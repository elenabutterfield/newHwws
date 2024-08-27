package hws.example.e137;

public class E137AccessModifiers {
    private static String name="John";
    String city="Miami";
    protected String schoolName="Syntax";
    public int batchNumber=9;

    public void displayDetails(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }
    public static void main(String[] args) {
    E137AccessModifiers obj=new E137AccessModifiers();
    obj.displayDetails();
    }
}

