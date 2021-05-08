package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL :Username cannot be null or empty");
        }
        System.out.println(isPalindrome("kayak"));
        System.out.println(isNullOrEmpty("civic"));
        System.out.println(reverse("Parvin"));

    }

    public static boolean isPalindrome(String str) {
        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() - i - 1)) {
                palindrome = false;
            }
        }
        return palindrome;
    }

    public static String reverse(String str) {
        String reversed ="";
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    }
