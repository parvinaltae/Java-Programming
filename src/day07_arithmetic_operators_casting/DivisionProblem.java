package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(5 / 2);
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 / num2);

        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);
        double d1 = 12;
        double d2 = 5;
        System.out.println( d1 / d2);

        int count = 100;
        double dCount = 30.0;
        System.out.println( count / dCount);
//      Primitive Casting = Conversion = use parenthesis ()
        int n1 = 4;
        byte b1 = (byte)n1;

        byte b2 = 55;
        int n2 = b2;


    }
}
