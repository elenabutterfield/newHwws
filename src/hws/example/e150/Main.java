package hws.example.e150;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Joe", "Smith", 35, 35000);
        employee.printEmployeeDetails();

        Student student=new Student("Adam", "Smith", 15,0,10);
        student.printStudentDetails();

        Retiree retiree=new Retiree("Frank","Smith", 65, 0,0,"tour");
        retiree.printRetireeDetails();
    }
    }

