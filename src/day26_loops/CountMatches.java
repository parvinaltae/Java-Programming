package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "Parvin";
        char letter = 's';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
            System.out.println("Count :" + count);
        }
    }
}
