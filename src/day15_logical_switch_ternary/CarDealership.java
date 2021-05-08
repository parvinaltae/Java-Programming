package day15_logical_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        int budget = 5000, carPrice = 4500;
        String model = "Toyota";
        if (budget >= carPrice && (model.equals("Toyota") || model.equals("Honda"))) {
            System.out.println("Ready to purchase model = " + model + " price="  + carPrice);
        } else {
            System.out.println("I need to learn how to code Java to afford a new car.");
        }
    }
}

