package day43_list_custom_classes;
import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        System.out.println(System.nanoTime()); // nanoseconds -> can have variable start and
        // end and subtract to find the difference in seconds
        List<Integer> mlnNums = getIntegerList();
        System.out.println(mlnNums);
       // System.out.println(Arrays.toString(getIntegerArray()));
        int[] arr = getIntegerArray();
        System.out.println(arr);
    }

    public static List<Integer> getIntegerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100_000; i++) {
            list.add(i);
        }
        return list;
    }
    public static int[] getIntegerArray(){
        //declare empty array with size - 1_000_001
        int[] nums = new int[1000001];
        for(int i = 0; i <=1_000_000; i++){
            nums[i] = i;
        }
    return nums;
    }

}
