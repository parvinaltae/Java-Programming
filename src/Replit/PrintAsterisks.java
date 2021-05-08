package Replit;

import java.util.Scanner;

public class PrintAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count= 0;

        while(count < n){
            System.out.print("*");
            count++;
            }
        }
    }
