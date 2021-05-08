package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        getUniqueIntegers();
    }

    private static void getUniqueIntegers() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));

        for (int each : nums) {
            if (Collections.frequency(nums, each) == 1) {
            }
        }
        System.out.println(nums + " ");
        // new array to store unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        for (int each : nums) {
            if (Collections.frequency(nums, each) == 1) {
                uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);
    }
}
