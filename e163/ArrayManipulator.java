package hws.example.e163;

public class ArrayManipulator {

    public final double avgElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        ArrayManipulator manipulator = new ArrayManipulator();
        int[] array = {3, 4, 5, 6, 6};
        System.out.println(manipulator.avgElements(array));
    }
}
