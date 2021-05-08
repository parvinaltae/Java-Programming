package day35_method_with_parameters;

import java.util.Scanner;

public class multipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1, d2);
    showSum(10,13);
    }
    public static void showSum (double num1, double num2){
        System.out.println("The sum is " + (num1 + num2));
    }
}
