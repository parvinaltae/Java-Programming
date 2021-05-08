package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.println(number);
            number+= 5;
        } while (number <= 1000);
        System.out.println("Done");
    }
}
