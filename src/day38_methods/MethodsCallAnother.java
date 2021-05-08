package day38_methods;

public class MethodsCallAnother {
    public static void main(String[] args) {
    start();
    printNums(1);

    }
    public static void start(){
        System.out.println("Start");
        continues();
    }
    public static void continues(){
        System.out.println("continue");
        end();
    }
    public static void end(){
        System.out.println("End");
    }
    public static void printNums(int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            printNums(num);
        }
    }
}
