package PracticeProblems;
import java.util.Scanner;
public class MorningNight {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int hour = value.nextInt();

        String timeOfDay = (hour > 24 ) ? "Invalid" : (hour >=0 && hour <=11) && (hour >=12 && hour <=24) ? "Morning" : "Night";
        System.out.println(timeOfDay);
    }
}
