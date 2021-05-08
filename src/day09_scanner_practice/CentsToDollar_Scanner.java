package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollar_Scanner {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println(" How many cents do you have?");
        int cents = value.nextInt();
        int dollars = cents / 100   ;
        int remainingCents = cents % 100;
        System.out.println("In " + cents  + " cents there is " + dollars
                + " dollar and " + remainingCents + " cents remaining" );
    }

}
