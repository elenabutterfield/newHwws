package hws.example.e163;

public class E163StringManipulator {

    private String str;

    public E163StringManipulator(String str) {
        this.str = str;
    }

    public final String reverseString() {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        E163StringManipulator manipulator = new E163StringManipulator("hello");
        System.out.println(manipulator.reverseString());

    }
}