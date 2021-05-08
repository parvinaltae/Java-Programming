package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(15,18));
        System.out.println(sum(20.3,6.5));
        System.out.println(sum(3,5,9));
        System.out.println(sum("Sunny", "Day"));
    }
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2){
        return num1 - num2;
    }
    public static int sum(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }
    public static String sum(String word1, String word2){
        return (word1 + " "+  word2);
    }
}
