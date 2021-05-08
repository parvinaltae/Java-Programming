package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
    seatInCar();
    startTheCar();
    shiftToDrive();
    pressGasPedal();
    }
    public static void pressGasPedal() {
        System.out.println("Hold steering wheel with two hands and press gas pedal");
    }
    public static void seatInCar(){
        System.out.println("Open the door and seat in driver seat");
    }
    public static void startTheCar(){
        System.out.println("Enter key in ignition and turn clockwise");
    }
    public static void shiftToDrive() {
        System.out.println("Press brake pedal and shift gear to D");
    }
}
