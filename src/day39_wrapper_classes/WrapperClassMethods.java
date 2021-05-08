package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(30, 65));
        System.out.println(Integer.MIN_VALUE); // smallest Integer that exists
        System.out.println(Integer.MAX_VALUE);// largest Integer that exists

        System.out.println(Double.max(234.4, 23.9));
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Double.compare(5, 5)); // if number same returns 0
        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(5, 7));

        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isDigit('v')); //false
        System.out.println(Character.isAlphabetic('z')); // true
        System.out.println(Character.isLetter('Q'));
        System.out.println(Character.isUpperCase('R'));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
    }
}
