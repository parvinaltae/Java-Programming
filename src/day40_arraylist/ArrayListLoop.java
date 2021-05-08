package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums); // prints []

        nums.add(34); nums.add(44); nums.add(3); nums.add(500);
        nums.add(600);nums.add(35); nums.add(73); nums.add(65);

        System.out.println("nums = " + nums);;
        nums.remove(0);
        System.out.println("nums = " + nums);
        // nums.remove(88); -> index Out of bounds exception
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);
        // for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        for(int each : nums){
            System.out.println(each + " ");
        }
    }
}
