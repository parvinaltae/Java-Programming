package Replits_April13;
import java.util.*;
public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int [] shiftNums = new int[size];
        for (int i=0; i <nums.length; i++) {
            if (i< nums.length-1) {
                shiftNums[i]= nums[i+1];
            }
            if (i==nums.length-1) {
                shiftNums[nums.length-1]=nums[0];
            }

        }
        System.out.println(Arrays.toString(shiftNums));
    }
}
