package day45_oop;

public class CoffeeObjects {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Coffee amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Coffee amount after drinking = " + myCoffee.getAmount());
        myCoffee.setType("Turkish Coffee");
        System.out.println(myCoffee.getType());
        //describe my coffee
        System.out.println(myCoffee.toString());

        // Adding another coffee object
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        // assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");
        // point to same object as coffee2
        coffee3 = coffee2;

        Coffee coffee4 = null;
        coffee4.setType("turkish");



    }
}
