package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total Price:");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $" + totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice);
        }
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " and" + num2 + " are equal");
        }else{
            System.out.println(num1 + " is greater than " + num2);
        }
    }
}
