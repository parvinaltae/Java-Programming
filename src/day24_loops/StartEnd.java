package day24_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end:");
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i++) {

            System.out.print(i  + " ");
        }
    }
}
