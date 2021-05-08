package PracticeProblems;

public class PrimeInRange {
    public static void main(String[] args) {
        int num = 20;

        for (int i = 1; i <= num; i++) {
             int prime = 0;
            for (int a = 1; a <= i; a++) {

                if (i % a == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.print(i + " | ");
            }
        }
    }
}

