package hws.example.e141;

public class E141AccessModifiers {

    public static int maxValue(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int []nums ={1,22,3,4,5};
        System.out.println(maxValue(nums));

        }

    }

