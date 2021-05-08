package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(15 >= 0);
        System.out.println(30 >= 10);
        System.out.println(16 != 10);

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean result;
        result = 5 ==5;
        System.out.println("result = " + result);

        int pears = 3;
        int basket = ++pears * 5/pears-- + --pears;
        System.out.println(basket);




    }
}
