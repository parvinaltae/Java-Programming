package day32_Arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length); //4

        for (String each : wordsArray) {
            System.out.println(each);
        }
        String sentence = "Today i am coding java arrays";
        String[] wordInSentence = sentence.split(" ");
        System.out.println("First word " + wordInSentence[0]);
        System.out.println("First word "+ sentence.split(" ")[0]);
        System.out.println("Number of words in sentence " + wordInSentence.length); // popular IQ**

        for (String each : wordInSentence) {
            System.out.println(each);
        }
    }
}
