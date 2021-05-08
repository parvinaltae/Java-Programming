package PracticeProblems;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people live with you?");
        int people = scan.nextInt();
        if (people < 2) {
            System.out.println("Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (people > 6) {
            System.out.println("Live with more than 6 people");
        }

        System.out.println(" what city they live in?");
        scan.nextLine();
        String city = scan.nextLine();


        System.out.println("Do you live in downtown?");
        String downTown = scan.next();
        System.out.println(downTown);

        if (downTown.equals("yes")) {
            System.out.println("Do you want to move?");
            String move = scan.next();
            if (move.equals("yes")) {
                System.out.println("Do it it is great");
            } else {
                System.out.println("you should think about it");
            }
        }

        System.out.println("favorite animal?");
        String animal = scan.next();
        System.out.println(animal + " is great animal");

        System.out.println("How many pet you want?");
        int animalCount = scan.nextInt();

        System.out.println("Interesting, do you want " + animalCount + " " +  animal );

    }
}

