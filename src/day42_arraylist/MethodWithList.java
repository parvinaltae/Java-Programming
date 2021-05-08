package day42_arraylist;

import java.util.*;

public class MethodWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("java", "is", "fun"));
        List<Integer> nums = Arrays.asList(5,6,79,8,4);
        sumInt(nums);
    }

    public static void printStrList(List<String> str) {
        for (String each : str) {
            System.out.print(each + " ");
        }
    }

    public static int sumInt(List<Integer> lists) {
        int sum = 0;
        for (int each : lists) {
            sum += each;
        }
        return sum;
    }
}
