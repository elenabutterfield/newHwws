package hws.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        // Create an array of integers with the values {45, 78, 12, 67, 55, 89, 23, 77, 88}
        int[] numbers={45, 78, 12, 67, 55, 89, 23, 77, 88};

        int[] indices={1,4,7};

        for (int i=0; i<indices.length; i++){
            int index=indices[i];
            System.out.print(numbers[index]+" ");
        }



        // Use a loop to iterate through the array and print the values at specific indices to get the result 78, 55, 77




    }
}
