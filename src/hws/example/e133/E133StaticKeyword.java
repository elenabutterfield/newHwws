package hws.example.e133;

public class E133StaticKeyword {

    public static int countA(String s){
        int count=0;
        for (int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (ch=='a'|| ch=='A') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String example1="aaa";
        String example2="aaBBdf8k3AAadnklA";
        System.out.println("count A( "+ example1+ ")==> "+ countA(example1));
        System.out.println("count A( "+example2+ ")==> "+countA(example2));

    }
}

