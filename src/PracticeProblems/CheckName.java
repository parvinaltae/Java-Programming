package PracticeProblems;
import java.util.Scanner;
public class CheckName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        String lastName= scan.nextLine();

        if (fullName.contains(lastName)) {
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }
    }
}
