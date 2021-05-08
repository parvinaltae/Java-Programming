package day18_conditions_practicie_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 15;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
/**
 * "FizzBuzz" -> when number is divisible by 3 and(&&) 5
 * "Fizz" -> when number is divisible by 3
 * "Buzz" -> when number is divisible by 5
 */
        int num1 = 15;
        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 == 0) {
            System.out.println("Fizz");
        }else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        }
}
