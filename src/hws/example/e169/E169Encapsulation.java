package hws.example.e169;

public class E169Encapsulation {
    public static void main(String[] args){
        Employee employee = new Employee();

        employee.setEmpName("John");
        employee.setEmpAge(30);

        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
    }
    }

