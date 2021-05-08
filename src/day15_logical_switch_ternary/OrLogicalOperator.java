package day15_logical_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || true = " + (true || false));
        System.out.println("true || true = " + (false || true));
        System.out.println("true || true = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 5 || oranges >4);
        if (apples > 5 || oranges >4) {
            System.out.println("No need to buy any fruits today");
        } else {
            System.out.println("Need to purchase more fruits");
        }
    }
}
