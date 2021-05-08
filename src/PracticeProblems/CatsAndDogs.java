package PracticeProblems;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i < word.length() - 2; i++) {
            String catOrDog = word.substring(i, i + 3);

            if (catOrDog.equals("dog")) {
                countOfDogs++;
            }
            if (catOrDog.equals("cat")) {
                countOfCats++;
            }
        }
        if (countOfDogs == countOfCats) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

