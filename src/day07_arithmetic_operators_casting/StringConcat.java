package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3);
        System.out.println(5 + 3 +"java");
        System.out.println("java" + (5+3));
        System.out.println( 5 + 3 + "java" + 5+3 + 5+3);
        System.out.println(5 + (3 + "java"));

        String str1= "hello";
        String str2 = "friends";

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + " " +  num2);
        System.out.println(num1+""+num2);

        char char1='a';
        char char2='b';
        System.out.println(char1 + char2);
        System.out.println(char1 + "" + char2);


    }
}
