package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage(); // calling the method
        displayMessage();
        displayMessage();

        for(int i = 1; i <=100; i++){
            displayMessage();
        }
    }
    public static void displayMessage() { // first custom reusable method
        System.out.println("Hello B22 Friends!");
    }
}
