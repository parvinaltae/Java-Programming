package day18_conditions_practicie_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
    String todayClass = "java";

        if (todayClass.equals("java"))
            System.out.println("java is fun" + "\n testing");
        else
        System.out.println("it is not java. It is " + todayClass);

        int score = 1;
        if (score ==1) {
            System.out.println("lowest score 1");
        } else if (score ==2) {
            System.out.println("score 2");
        } else if (score ==3) {
            System.out.println("score is 3");
        } else {
            System.out.println("invalid");
        }
    }
}
