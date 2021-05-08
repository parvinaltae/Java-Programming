package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 13;
        count = count + 10;
        System.out.println(count);

        double fuelPrice = 2.99;
        fuelPrice = fuelPrice - 1.0;
        System.out.println("Fuel Price in my area is $" + fuelPrice);

        int apples = 2;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);

    }
}
