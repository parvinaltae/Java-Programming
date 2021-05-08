package PracticeProblems;

public class OperatorPractice {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 /3 % 2;
        //         (3 + 2) * 2 /3 % 2
        //          7 * 2 / 3 % 2
        System.out.println(c);

        int num1 = 10;
        int num2 = num1++ * 3 + ++num1 + num1++ % 2;
        //          10 * 3 + 12 + 12 % 2
        //              30 + 12 = 42
        int biggest = num1 > num2 ? num1 :num2; // num1
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(biggest);
    }
}
