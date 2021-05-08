package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("Java", 3, '|');
    }

    public static String repeatString(String word, int times, char delimeter) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += (word + delimeter);
        }
        System.out.println(result.substring(0, result.length() - 1));
        return result;
    }
}


