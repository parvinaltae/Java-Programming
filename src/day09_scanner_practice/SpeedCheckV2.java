package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed?");
        int speedLimit = scan.nextInt();
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + "mph" + " over the speed limit. Slow down!");
    }
}
