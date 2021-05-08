package day13_conditional_statements;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** WELCOME TO CHASE ATM ***");
        int secretPincode = scan.nextInt();
        int inputPincode = scan.nextInt();

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account. \nYou can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode + "\nPlease try again");
        }
        System.out.println("Thank you for using Chase Bank");
    }
}
