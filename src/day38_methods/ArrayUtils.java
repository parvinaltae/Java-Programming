package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayUtils.printArray(nums);
        System.out.println(ArrayUtils.sum(nums));
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return true;
            } else {
                return false;
            }
        }
    return false;
    }
}

