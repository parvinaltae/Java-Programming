package day_16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        int calories = 0;

        switch (size) {
            case "tall":
                price = 3.00;
                calories = 90;
                System.out.println("Tall cappucino please");
                break;
            case "grande":
                price = 3.50;
                calories = 120;
                System.out.println("Grande cappuccino please");
                break;
            case "venti":
                price = 4.20;
                calories = 160;
                System.out.println("Venti cappuccino please");
                break;
            default:
                System.out.println("We don't serve that size of cappuccino.");

        }

        System.out.println("Total price = " + price);
        System.out.println("You will consume " + calories + " cal of energy.");
    }
}
