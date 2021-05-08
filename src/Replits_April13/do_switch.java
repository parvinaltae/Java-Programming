package Replits_April13;
import java.util.*;
import java.util.Arrays;
public class do_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));
    }


    public static int[] do_switch(int[] i) {
        int temp = i[i.length-1];
        i[i.length-1] = i[0];
        i[0]= temp;
        return i;

    }
}
