package hws.example.e134;

import java.sql.SQLOutput;
import java.util.Locale;

public class E134StaticKeyword {

    public static int countVowels (String s){
    int count =0;
    String lowerCaseString= s.toLowerCase();
     for (int i=0; i<lowerCaseString.length(); i++){
         char ch= lowerCaseString.charAt(i);
         if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             count++;
         }
     }
     return count;
    }
    public static void main(String[] args) {
        String example1= "Trump";
        String example2= "happy friday! i love weekends";
        System.out.println("countVowels (\""+example1+"\")==> "+countVowels(example1));
        System.out.println("countVowels (\""+example2+"\")==> "+countVowels(example2));

    }
}

