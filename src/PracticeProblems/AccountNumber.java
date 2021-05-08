package PracticeProblems;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNum = "5896789";

        if (accountNum.startsWith("2")) {
            if (accountNum.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
        } else if (accountNum.startsWith("5")) {
            if (accountNum.length() == 10) {
                System.out.println("Valid 5 digit account number");
            } else {
                System.out.println("Invalid 10 digit account number");
            }
            } else {
                System.out.println("Invalid Account Number");
            }
        }
    }

