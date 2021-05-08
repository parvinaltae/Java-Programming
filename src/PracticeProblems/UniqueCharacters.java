package PracticeProblems;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "LLLLMNNOPP";
        String unique = "";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int a = 0; a < word.length(); a++) {
                if (word.charAt(i) == word.charAt(a)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += word.charAt(i);
            }
            count = 0;
        }
        System.out.println(unique);
    }
}
