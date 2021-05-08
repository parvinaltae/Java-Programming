package day37_methods_overloading;

import java.util.*;
public class DaySelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = scan.nextInt();
        System.out.println(getDayName(day));
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }
}
