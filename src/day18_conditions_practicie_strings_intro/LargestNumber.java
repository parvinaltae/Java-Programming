package day18_conditions_practicie_strings_intro;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10, num2 = 16, num3 = 4;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num2 + " is the greatest number");
        }
    }
}

