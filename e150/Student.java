package hws.example.e150;

public class Student extends Employee{
    private int grade;

    public Student(String name, String lastName, int age, int salary, int grade){
        super(name, lastName, age, salary);
        this.grade=grade;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void printStudentDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getGrade());

    }

}
