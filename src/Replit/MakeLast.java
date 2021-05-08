package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int newLength = nums.length * 2;
        int[] newArray = new int[newLength];
        newArray[newLength-1] = nums[nums.length-1];

        for( int i =0; i <newArray.length-1; i++){
            newArray[i] = 0;
        }
        System.out.println(Arrays.toString(newArray));
    }
}

