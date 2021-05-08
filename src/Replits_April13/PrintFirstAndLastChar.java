package Replits_April13;

import java.util.*;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String newWord = "";
        for (int i = 0; i < words.length; i++) {
            newWord += words[i].charAt(0) + (words[i].charAt(words[i].length() - 1) + " ");
            if (words[i].equals(newWord)) {
            }
        }
        String[] newWordArr = newWord.split(" ");
        System.out.println(Arrays.toString(newWordArr));
    }
}
