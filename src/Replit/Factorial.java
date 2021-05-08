package Replit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial = 1L;

        while(n>=1){
            factorial *=n;
            n--;
        }
        System.out.println(factorial);

    }
}
