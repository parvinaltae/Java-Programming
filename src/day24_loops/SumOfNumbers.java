package day24_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 5; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
