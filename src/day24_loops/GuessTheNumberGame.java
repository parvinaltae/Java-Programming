package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNum = randomNum.nextInt(100);
        int guessingNum = 0;
        int count = 5;
        do {
            System.out.println("Guess the secret number");
            guessingNum = scan.nextInt();
            if (guessingNum > secretNum) {
                System.out.println("Wrong, number too large");
            } else if (guessingNum < secretNum) {
                System.out.println("Wrong, number too small");
            }
        } while (secretNum != guessingNum);
        System.out.println("Congratulation, you won! Secret number is :" + secretNum);
    }
}
