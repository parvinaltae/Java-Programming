package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "SDET";
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        System.out.println(word);
        String word2 = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(word2);
        String word3 = (word.equalsIgnoreCase(word2) ? "Palindrome" : "Not palindrome");

        }
    }
