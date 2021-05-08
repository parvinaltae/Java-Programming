package day10_shorthand_operators;
import java.util.Scanner;
public class PracticeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String Item1 = scan.next();
        Double price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String Item2 = scan.next();
        Double price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String Item3 = scan.next();;
        Double price3 = scan.nextDouble();
        Double totalPrice = price1 + price2 + price3;
        System.out.println("Pasta Price: " + price1 + ", Item2: Parmesan Price: " + price2 +", " +
                "Item3: Tomatoes Price: " + price3 + "\nTotal price: " + totalPrice );
    }
}
