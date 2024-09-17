package hws.example.e145;

public class E145Dog {

    private String dogName;
    private double dogWeight;
    static String dogBreed="Mutt";

    public E145Dog (String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
        public void displayDetails(){
            System.out.println(dogName+" "+dogWeight+" "+dogBreed);
        }

    public static void main(String[] args) {
        E145Dog dog=new E145Dog("Tarzan", 50.0);
        dog.displayDetails();
        E145Dog dog2=new E145Dog("Lusy", 10.0);
        dog2.displayDetails();

    }

}
