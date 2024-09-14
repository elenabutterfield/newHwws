package hws.example.e139;

public class E139AccessModifiers {
    public static String alphabetical(String str){
        StringBuilder result=new StringBuilder();
        char prevChar='\0';

        for(char ch:str.toCharArray()){
            if (ch>prevChar){
                result.append(ch);
                prevChar=ch;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello" ));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));

    }


}

