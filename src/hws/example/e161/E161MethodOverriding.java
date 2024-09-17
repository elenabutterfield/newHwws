package hws.example.e161;

public class E161MethodOverriding {
    public static void main(String[] args) {
        E161Employee[] employees = {new Manager(), new Developer(), new Intern()};
        for (E161Employee emp : employees) {
            emp.hello();
        }
        Developer dev = new Developer();
        dev.work();
        dev.takeBreak();
        dev.attendMeeting();
    }
}
