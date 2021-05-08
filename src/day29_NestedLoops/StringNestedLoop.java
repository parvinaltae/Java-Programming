package day29_NestedLoops;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i < word.length(); i++){
            for(int a = 0; a <= i ; a++){
                System.out.print(word.charAt(a));
            }
            System.out.println();
        }
    }
}
