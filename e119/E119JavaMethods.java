package hws.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(censorLetter("programming",'g'));
        System.out.println(censorLetter("hello world",'o'));
    }
static String censorLetter(String input,char target){
        return input.replace(target,'*');
}
}
