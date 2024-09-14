package hws.example.e135;

public class E135StaticKeyword {
    public static String surround( String s, String search_term){
    return s.replace(search_term,"("+search_term+")");
    }

  
    public static void main(String[] args) {
        String example1="abcabcabc";
        String search_term1="c";
        System.out.println("surround(\""+example1+"\",'"+search_term1+"')==>"+surround(example1,search_term1));

        String example2="technology";
        String search_term2="o";
        System.out.println("surround(\""+example2+"\",'"+search_term2+"')==>"+surround(example2,search_term2));

    }
}

