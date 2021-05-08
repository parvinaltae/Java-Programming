package Replit;

import java.util.*;

public class FindSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

    int sum = 0;
    for(int eachNum : nums){
        sum += eachNum;
    }
        System.out.println(sum);
    }
}
