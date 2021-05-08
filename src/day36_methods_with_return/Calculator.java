package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(15, 65.89));
        double sum = add(6, 5.2);
        System.out.println("sum = " + sum);
        System.out.println(add(10, 13));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }
}
