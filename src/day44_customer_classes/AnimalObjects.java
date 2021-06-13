package day44_customer_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal turtle =   new Animal();
        System.out.println(turtle.type);
        turtle.eat();
        turtle.speak();

        turtle.eat("grass");

        Animal cheetahObj = new Animal(); // new class object
        cheetahObj.type = "Cheetah"; // changing type
        System.out.println(cheetahObj.type);
    }
}
