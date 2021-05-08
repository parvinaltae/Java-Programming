package PracticeProblems;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String word = "Java is fun";
        String secondWord = word.substring(word.indexOf(" ") +1 , word.lastIndexOf(" "));
        String reverse = "";

        for(int i = secondWord.length()-1; i >= 0 ; i--) {
            reverse += secondWord.charAt(i);
        }
        word = word.replace(secondWord, reverse);
        System.out.println(word);
    }
}
