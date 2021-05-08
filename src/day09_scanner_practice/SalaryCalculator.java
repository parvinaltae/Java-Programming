package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the hourly rate?");
        int hourlyRate = scan.nextInt();
        int weeklyPay = hourlyRate * 40;
        int monthlyPay = weeklyPay * 52 / 12;
        int annualPay = monthlyPay * 12;
        System.out.println("Weekly rate is: $" + weeklyPay +
                "\nMonthly rate is: $" + monthlyPay +
                "\nAnnual rate is: $" + annualPay);
    }
}
