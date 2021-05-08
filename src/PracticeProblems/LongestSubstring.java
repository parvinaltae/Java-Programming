package PracticeProblems;

public class LongestSubstring {
    public static void main(String[] args) {
        // Biggest substring of matching character, given string
        // find the biggest substring of chars that match and print it.
        String word = "aaabbbbbbbcccccddddee";
        String longestSubstring = "";
        String temp = "";

        for (int i = 0; i < word.length() - 1; i++) {
            temp += word.charAt(i);
            if(i == word.length()-2) {

            }
            if (word.charAt(i) != word.charAt(i + 1) || i == word.length()-2) {
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }
            temp = "";
            }
        }
        System.out.println("Longest substring " + longestSubstring);
    }
}
