package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your rent? ");
        Double rent = scan.nextDouble();
        scan.nextLine();
        System.out.println("What month? ");
        String month = scan.nextLine();
        System.out.println(rent + month + " is the rent");
    }
    
}
