package Replit;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scan.nextInt();
        scan.nextLine(); // have to place this to be able to use second string in scanner/ otherwise glitch
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println(age + name);
        String test = scan.nextLine();
        System.out.println(test);
    }
}


