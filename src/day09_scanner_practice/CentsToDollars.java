package day09_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 123;
        int dollars = cents / 100   ;
        int remainingCents = cents % 100;
        System.out.println("In " + cents  + " cents there is " + dollars
                + " dollar and " + remainingCents + " cents remaining" );
    }
}
