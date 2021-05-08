package day08_casting_scanner;
import java.util.Scanner;
// For Scanner -> Step 1. enter import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//Step 2 ->create Scanner Object : type above statement
        System.out.println("Please enter your name: ");
// Step 3 -> promp for questions
        String firstName = scan.next(); // Parvin
//Step 4: Capture and Store User input
        System.out.println(" nice to meet you," + firstName);


    }
}
