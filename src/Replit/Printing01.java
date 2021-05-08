package Replit;

import java.util.*;

public class Printing01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        String letter = "";

        for (int i = 0; i < arr.length; i++) {
            letter += arr[i];
        }
            System.out.println(letter);
        }
    }
