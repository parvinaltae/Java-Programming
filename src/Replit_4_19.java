import java.util.*;

public class Replit_4_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));

    }
    public static boolean isAnagram(String word1, String word2) {
        boolean checkAnagram = true;
        int count = 0;
        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");
        if (word1.length() == word2.length())
            for (int i = 0; i < word1.toLowerCase().length(); i++) {
                if (word2.toLowerCase().contains("" + word1.charAt(i))) {
                    count++;
                }
    } else {
            count = 0;
        }
    return count ==word1.length()?true:false;
}
        }


