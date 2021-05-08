package Replits_April13;
import java.util.*;
public class InnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for (int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for (int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        for(int n= 0; n < inner.length; n++){
            if(Arrays.binarySearch(outer,inner[n]) < 0){
                System.out.println("false");
                break;
            } else if (n==inner.length-1) {
                System.out.println("true");
            }
        }
    }
}

