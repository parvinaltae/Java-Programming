package PracticeProblems;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String letters = "AABBCDDEEEF";
        String duplicate = "";

        for (int i = 0; i < letters.length() - 1; i++) {
            int count = 0;
            for (int a = 0; a < letters.length(); a++) {
                if (letters.charAt(i) == letters.charAt(a)) {
                    count++;
                }
            }
            if (count > 1 && !duplicate.contains("" + letters.charAt(i))) {
                duplicate += letters.charAt(i);
            }
        }
        System.out.println(duplicate);
    }
}
