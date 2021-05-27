package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("Car1 year = " + car1.getYear());

        car1.setMileage(10_000);
        System.out.println("Car1 mileage = " + car1.getMileage());
    }
}
