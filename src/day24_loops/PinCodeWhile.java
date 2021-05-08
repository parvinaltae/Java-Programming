package day24_loops;

import java.util.Scanner;

public class PinCodeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int SecretePinCode = 6543;
        int pinCode;
        int tries = 3;
        do {
            System.out.println("Enter your pin code: ");
            pinCode = scan.nextInt();
            if (pinCode == SecretePinCode) {
                System.out.println("Welcome to your account!");
            }
            tries--;
        } while (pinCode != SecretePinCode && tries > 0);
        if (tries == 0 && pinCode != SecretePinCode) {
            System.out.println("You reached maximum limit of tries, try again later");
        }
    }
}

