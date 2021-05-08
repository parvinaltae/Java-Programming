package day29_NestedLoops;

public class StringLoopsPractice {
    public static void main(String[] args) {
        // How many times each letter repeats?
        String word = ("java");
        String letter = "";
        for (int outerChar = 0; outerChar < word.length(); outerChar++) {
            int count = 0;
            for (int innerChar = 0; innerChar < word.length(); innerChar++) {
                if (word.charAt(outerChar) == word.charAt(innerChar)){
                    count++;
                    }
                }
            if(!letter.contains(word.charAt(outerChar) + "")) {
                letter += "" + word.charAt(outerChar) + " = " + count + "\n";
            }
        }
        System.out.println(letter);
    }
}


