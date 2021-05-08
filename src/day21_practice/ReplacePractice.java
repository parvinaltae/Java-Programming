package day21_practice;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        word = word.replace("hub","Lab");

        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println(withNoSpaces);
        sentence = sentence.replace("java","selenium").replace("fun"," a lot of fun");

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","").replace(" results " +
                "for java book","").replace(",","");
        System.out.println("result = " + result);
        int count = Integer.parseInt(result);
        System.out.println(count);


    }
}
