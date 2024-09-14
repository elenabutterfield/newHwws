package hws.example.e156;

public class Dog extends E156Animal{
    String sound="bark";

    public void displaySound(){
        System.out.println("Dog sound : "+sound);

        System.out.println("Animal sound : "+super.sound);
    }
}
