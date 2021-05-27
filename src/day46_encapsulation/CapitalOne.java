package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountNumber(435899721512L);
        account.setBalance(4570.89);
        account.setAccountHolder("Mike Smith");
    }
}
