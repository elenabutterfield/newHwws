package hws.example.e163;

public class Main {
    public static void main(String[] args) {

        E163StringManipulator stringManipulator = new E163StringManipulator("hello");
        System.out.println(stringManipulator.reverseString());


        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int[] array = {3, 4, 5, 6, 6};
        System.out.println(arrayManipulator.avgElements(array));
    }

    }

