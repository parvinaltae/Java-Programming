package PracticeProblems;

public class String_Replace_Practice {
    public static void main(String[] args) {
        String word1 = "morning tea", word2 = "day", word3 = "Bye Gals";

        if (word1.length() >= 7 && word1.contains("a")) {
            System.out.println("Longest word is " + word1);
            if (word2.length() >= 7 && word2.contains("a")) {
                System.out.println("Longest word is " + word2);
                if (word3.length() >= 7 && word3.contains("a")) {
                    System.out.println("Longest word is " + word3);
                }
                } else {
                    System.out.println("Not the longest word, and does not contain a");
                }
            }
        }
    }


