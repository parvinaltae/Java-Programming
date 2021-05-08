package Replits_April13;

import java.util.*;

public class PalindromeReplit {
    public static boolean isPalindrome(String check) {
        // your code here
        check = check.replace(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < check.length() / 2; i++) {
            if (check.toLowerCase().charAt(i) != check.toLowerCase().charAt(check.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
