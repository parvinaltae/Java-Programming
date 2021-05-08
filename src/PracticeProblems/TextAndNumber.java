package PracticeProblems;

public class TextAndNumber {
    public static void main(String[] args) {
        String message = "You campleted 1 month with Cybertek";
        int number = 1;

        if (number ==1) {
            message = message.replace("a", "o");
            System.out.println(message);
        } else if (number == 2) {
            message = message.replace("k", "c");
            System.out.println(message);
        } else if (number ==3) {
            message = message.replace("m","z");
            System.out.println(message);

        }
    }
}
