package day30_arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
    
        int[] nums = { 5, 3, 9, 2, 4};
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));

            String[] words = {"Java", "Is", "fun"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); // uppercase letter come first
        Arrays.sort(words, Collections.reverseOrder());

        int[] num = {33,55,123,400};
        System.out.println(Arrays.binarySearch(num, 55));
    }
}
