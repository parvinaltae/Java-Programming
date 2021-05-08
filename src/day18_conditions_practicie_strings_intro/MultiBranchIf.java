package day18_conditions_practicie_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 9;

        if (number > 0) {
            System.out.println("positive number: " + number);
        } else if (number < 0) {
            System.out.println("negative number" + number);
        } else {
            System.out.println("number is zero" + number);
        }
    }
}
