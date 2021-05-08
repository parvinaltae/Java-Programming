package day11_comparison_operators;

import javax.lang.model.SourceVersion;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1; // Pre Increment
        System.out.println("num1 = " + num1); //11
        System.out.println("num2 = " + num2); //11
        int num3 = 20; // Post Increment
        int num4 = num3++;
        System.out.println("num3 = " + num3); //21
        System.out.println("num4 = " + num4); //20

        int a = 50;
        int b = 22;
                //50 + 23
        int c = a++ + ++b;
        // -> adds 1 to a HERE in this line, at this step afterwards.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
