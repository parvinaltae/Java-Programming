package PracticeProblems;

import java.util.Random;

public class SixDigits {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNum = "";

        while (randomNum.length() != 6) {
            int eachRandom = random.nextInt(9)+1;
            if (!randomNum.contains("" + eachRandom)) {
                randomNum += eachRandom;
            }
        }
        System.out.println("Random number: " + randomNum);
        System.out.println(random.nextInt(10));
    }
}