package day40_arraylist;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(563);
        nums.add(7);

        System.out.println("size is : "+ nums.size());
        System.out.println("index 0 = " + nums.get(0));
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);
    }
}
