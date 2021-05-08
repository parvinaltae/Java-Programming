package day09_scanner_practice;
import java.util.Scanner;
public class askAge {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in); // create scanner here
        Scanner color = new Scanner(System.in); // and here
        System.out.println(" How old are you?"); // prompt questions
        int age = value.nextInt(); // declare varibale
        System.out.println("That's a great age!" + "\nWhat's your favorite color?"); //print
        String favoriteColor = color.next(); //declare variable
        System.out.println("Nice color!");
    }
}
