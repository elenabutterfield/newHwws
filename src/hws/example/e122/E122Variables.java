package hws.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the country, capital, and population size
     private String country;
     private String capital;
     private int population;

     public E122Variables(String country, String capital, int population){
         this.country=country;
         this.capital=capital;
         this.population=population;
     }

    // Create a method to display values of instance variables
    public void displayValues(){
        System.out.println(" The capital of "+country+" is "+capital+" and population is "+population);
    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
        E122Variables country1=new E122Variables("USA", "Washington DC", 331_000_000);
        E122Variables country2=new E122Variables("India","New Delhi", 1_380_000_000);

     country1.displayValues();
     country2.displayValues();
    }
}
