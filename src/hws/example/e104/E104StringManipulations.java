package hws.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
        System.out.println("Input 5 names: ");
      for (int i=0; i<arr.length; i++){
          System.out.println("Enter name "+(i+1)+": " );
          arr[i]=input.nextLine();
      }
      for(String name : arr){
          if (name.length() >=3){
              System.out.println(name.substring(0,3));
          }else{
              System.out.println(name);
          }
      }
        }


    }



