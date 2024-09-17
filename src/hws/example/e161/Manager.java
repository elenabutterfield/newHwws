package hws.example.e161;

public class Manager extends E161Employee{
    public void work() {
        System.out.println("I am a Manager working");
    }
    protected void takeBreak() {
        System.out.println("I am a Manager taking a break");
    }
    void attendMeeting() {
        System.out.println("I am a Manager attending a meeting");
    }
    public void hello() {
        System.out.println("method in Manager class");
    }
}
