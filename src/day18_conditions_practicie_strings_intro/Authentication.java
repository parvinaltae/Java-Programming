package day18_conditions_practicie_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4321, pinCode = 1568, expLast4SSN = 4321, expPinCode = 5689;

        if (expLast4SSN == last4SSN) {
            if (expPinCode == pinCode) {
                System.out.println("Authentication successful");
            } else {
                System.out.println("incorrect pin code");
            }
        } else {
            System.out.println("incorrect SSN");
        }
    }
}
