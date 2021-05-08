package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Sunny Day";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println("Sunny day".toLowerCase());

        String wordInCase = word.toLowerCase();
        System.out.println(wordInCase);

        word = word.toLowerCase();
        System.out.println(word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
    }
}
