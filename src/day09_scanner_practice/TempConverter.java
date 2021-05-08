package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in Fahrenheit ");
        int F = input.nextInt();
        double conversion = (F - 32 ) * 5 / 9 ;
        System.out.println(F + " °F = " + conversion + "°C");
    }

}
