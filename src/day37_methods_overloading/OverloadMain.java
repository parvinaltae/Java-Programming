package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args   ) {
        System.out.println("Hello from Real main method");
        main(10);

    }
    public static void main(int num){
        System.out.println("num = " + num);

    }
}
