package Replit;
import java.util.Scanner;
public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String xxx = "" + str.charAt(i) + str.charAt(i) + str.charAt(i); // triple consecuritively
            if (str.substring(i, i + 3).equals(xxx)) { // if first three letter == repeat triple x
                count++;
            }
        }
        System.out.println(count);
    }
}


