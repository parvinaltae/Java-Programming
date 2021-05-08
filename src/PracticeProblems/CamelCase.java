package PracticeProblems;

public class CamelCase {
    public static void main(String[] args) {
        String sentence = "TodayWasWarmAndSunny";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count + " is the number of words in the sentence");
    }
}
