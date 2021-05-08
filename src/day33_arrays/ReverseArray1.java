package day33_arrays;

import java.util.*;

public class ReverseArray1 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length]; // { 0, 0 , 0 , 0 }

        for(int i = nums.length -1, j = 0; i >= 0; i--, j++){ // two variables
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));
    }
}
