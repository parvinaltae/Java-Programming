package Replits_April13;
import java.util.*;
public class PrintShortestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] wordsInSentence = str.split(", ");
        String allwords = "";
        String shortest = wordsInSentence[0];
        for (int i = 1; i < wordsInSentence.length; i++) {
            if (wordsInSentence[i].length() < shortest.length()) {
                shortest = wordsInSentence[i];
                allwords=shortest+" ";
            }
            for (String each : wordsInSentence) {
                if (each.length() == shortest.length()&&!allwords.contains(each)) {
                    allwords += each+" ";
                }
            }
        }
        String[] newWordsArr = allwords.split(" ");
        Arrays.sort(newWordsArr);System.out.println(Arrays.toString(newWordsArr));
    }
}
