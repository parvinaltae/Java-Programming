package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //Auto-boxing : primitive -> object
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;
        
        // Un-boxing: object -> primiti
        Double d1 = new Double(100.5);
        double d2 = d1;
    }
}
