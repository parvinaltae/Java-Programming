package day44_customer_classes;

public class Animal {
    String type = "some animal";


    public void eat() {
        System.out.println("Animal eats");
    }

    public void speak() {
        System.out.println("Animal speaks");
    }
    public void eat(String food){
        System.out.println("eating " + food);
    }
}

