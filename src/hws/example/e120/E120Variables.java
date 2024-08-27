package hws.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    private String school;
    private int year;
    private int batch;

    public E120Variables(int year, String school, int batch){
        this.year=year;
        this.school=school;
        this.batch=batch;
    }

    public static void main(String[] args) {
    E120Variables student=new E120Variables(2020, "Syntax", 6);
        System.out.println("I am a student of batch "+student.batch+" studying at "+student.school+ " in the year of "+student.year);

        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format

    }
}
