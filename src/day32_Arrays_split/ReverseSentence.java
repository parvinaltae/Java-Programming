package day32_Arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("reversed: "+ reversed);
    }
}
