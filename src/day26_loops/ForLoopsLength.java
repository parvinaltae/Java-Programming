package day26_loops;

public class ForLoopsLength {
    public static void main(String[] args) {
        String word = "Java is fun";
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}

