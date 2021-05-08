package day08_casting_scanner;
public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        int price3 = 15;
        double remainingBalance = balance - (price1 + price2 + price3);
        System.out.println(remainingBalance);
        System.out.println("Your initial balance: $" + balance);
        System.out.println( "Your remianing balance: $" + remainingBalance);

        int balanceNoChange = (int)remainingBalance;
        System.out.println(" Your remaining balance without cents: $" + balanceNoChange);

    }
}
