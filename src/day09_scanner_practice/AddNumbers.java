package day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st numbers:");
        int n1 = scan.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = scan.nextInt();
        int result = n1+n2;
        System.out.println("Result = " + result);
    }
}
