package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 2;
        if (number < 1 || number > 10) {
            System.out.println("Error, invalid input");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(number + " x " + a + " = " + (number * a) + "\t\t");
            }
            System.out.println();
        }
    }
}


