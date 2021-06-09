package day49_static;

public class StaticMethods {
    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
        // System.out.println("num = " + num); -> ERROR: because num is instance variable. Static can't access
        System.out.println("count: " + count); // no error. count is static variable
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
    }

    // StaticMethod.instanceMethod(); -> no
    //StaticMethod stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println();
    }

}
