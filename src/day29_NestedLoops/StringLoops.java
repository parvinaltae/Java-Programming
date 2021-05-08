package day29_NestedLoops;

public class StringLoops {
    public static void main(String[] args) {
        String word = "Java";

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
        }
    }
}
