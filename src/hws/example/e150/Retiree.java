package hws.example.e150;

public class Retiree extends Student{

    private String seniorActivity;

    public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity ){
        super(name, lastName, age, salary, grade);
        this.seniorActivity=seniorActivity;

    }
    public String getSeniorActivity(){
        return seniorActivity;
    }
    public void setSeniorActivity(String seniorActivity){
        this.seniorActivity=seniorActivity;
    }

    public void printRetireeDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getSeniorActivity());
    }
}
