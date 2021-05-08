package Replit;
import java.util.*;
public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

     int maxNum = 0;
     for(int eachNum : nums){
         if(eachNum > maxNum) {
             maxNum = eachNum;
          }
     }
        System.out.println(maxNum);
    }
}
