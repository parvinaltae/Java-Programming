package PracticeProblems;
import java.util.Scanner;
public class MorningOrNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte hour = scan.nextByte();
        String time;
        if(hour > 24) {
            System.out.println("Invalid time. Please use 0-24");
        } else{
            time = (hour >= 0 && hour <= 11) || (hour <= 12 && hour >= 24) ? "morning" : "night";
            System.out.println(time);
            //System.out.println(time);
        }
    }
}

