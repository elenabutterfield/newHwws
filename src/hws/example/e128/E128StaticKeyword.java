package hws.example.e128;

public class E128StaticKeyword {
    public static String mixString(String s1,String s2){
        StringBuilder result=new StringBuilder();
        int minLength=Math.min(s1.length(),s2.length());

        for (int i=0; i<minLength; i++){
            result.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (s1.length()>minLength){
            result.append(s1.substring(minLength));
        } else if (s2.length()>minLength) {
            result.append(s2.substring(minLength));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";
        String combined = mixString(s1, s2);
        System.out.println("Combined string: " + combined);

    }

}