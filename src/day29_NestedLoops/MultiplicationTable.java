package day29_NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                int result= inner * outer;
                System.out.print(inner + " * " + outer + " =" + result + "\t");
            }
            System.out.println();
        }
    }
}

