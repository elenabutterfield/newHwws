package hws.example.e132;

public class E132StaticKeyword {

    public static double[][] reduce10(double[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] inputArray = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
    double[][] modifiedArray=reduce10(inputArray);
    for(double[]row:modifiedArray){
        for(double num:row){
            System.out.println((int)num+" ");
        }
        System.out.println();
    }
    }
}

