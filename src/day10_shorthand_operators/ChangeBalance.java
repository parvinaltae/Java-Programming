package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 2000.35;
        balance = balance / 2;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("Balance after baklava = " + balance);

        double kunefe = 40.0;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("Balance after Kunefe is $" + kunefe);
        balance = balance - (kunefe / 2);
        System.out.println("Remaining balance is $ " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("Remaining balance $ " + plov);

        double icedTea = 3.00;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("Balance after Iced Tea = " + balance);
        // return baklava
        balance = balance + baklava;
        int remainingBalance = (int)balance;
        System.out.println("remainingBalance = " + remainingBalance);
        baklava +=8; // shorthand operators
        System.out.println("remainingBalance = " + remainingBalance);
    }
}
