package hws.example.e118;

public class E118JavaMethods {
    public static String spaceOut(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (i < s.length() - 1) {
                result.append(" ");
            }
        }
        result.append(" ");
        return result.toString();
    }
        public static void main (String[]args){
            // Students will write the code here.
            System.out.println(spaceOut("hello"));
            System.out.println(spaceOut("technology"));
        }

    }
