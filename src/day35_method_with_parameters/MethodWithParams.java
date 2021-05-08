package day35_method_with_parameters;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(10);
        displayValue(15);
        int count = 55;
        displayValue(count);
        greetByName("Parvin");
        greetByName("Murodil");
    }
    public static void displayValue(int num){
        System.out.println("Value: " + num);
    }
    public static void greetByName(String name){
        System.out.println("Hello " + name + " how are you today?");
    }
}
