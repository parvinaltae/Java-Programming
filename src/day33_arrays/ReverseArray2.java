package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap those using additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println(Arrays.toString(nums)); // after swapping first and last index

        int[] nums2 = {5, 10, 4, 100};
        for (int i = 0; i < nums2.length / 2; i++) { // when reversing loop onto to half, otherwise prints all
            int temp2 = nums[i]; // use temp variable
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println(Arrays.toString(nums2));
        // reverse nums2
        String[] words = {"java", "html", "js", "ruby", "css"};
        for (int i = 0; i < words.length / 2; i++) {
            String temps = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temps;
        }
        System.out.println("words - after swap = " + Arrays.toString(words));
        // reverse words
        for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) { // when dividing in half decimal is dismissed
            String tempWord = words[i];
            words[i] = words[i];
            words[j] = tempWord;
        }
        System.out.println(Arrays.toString(words));
    }
}
