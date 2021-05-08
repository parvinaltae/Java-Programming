package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavva";
        for (int index = 0; index < word.length()-1; index++) {
            if(word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));
            }
            }
        }
    }
