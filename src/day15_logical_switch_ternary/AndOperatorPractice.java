package day15_logical_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wireless Charger";
        if (onSale && freeShipping) {
            System.out.println("You may purchase the item - " + itemName);
        } else {
            System.out.println("Don't touch it!");
        }
        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to card -" + itemName);
        } else {
            System.out.println("Keep shopping");
        }
        String location = "Virginia";
        int salary = 120_000;
        boolean remote = true, benefits = true;
        if (location.equals("Virginia") && salary >= 120000 && remote && benefits){
            System.out.println("This is your match");
        }else {
            System.out.println("Keep searching");
        }
    }
}
