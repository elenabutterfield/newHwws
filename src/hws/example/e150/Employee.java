package hws.example.e150;

public class Employee extends E150Person{
    private int salary;

    public Employee(String name, String lastName, int age, int salary){

        super(name, lastName, age);
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void printEmployeeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
}


