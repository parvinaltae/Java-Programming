package day08_casting_scanner;
import java.util.Scanner;
public class myScannerPractice {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner value = new Scanner(System.in);
        System.out.println("Please enter  your favorite color:");
        String color  = scan.next();
        System.out.println("My favorite color is = " + color);

        System.out.println("What is your favorite number:");
        String age = scan.next();
        System.out.println("age = " + age);

        System.out.println("How old are you?");
        int myAge = value.nextInt();
        System.out.println("myAge = " + myAge);
        
    }
}
