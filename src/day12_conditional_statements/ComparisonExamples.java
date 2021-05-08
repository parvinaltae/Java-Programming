package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed >= speedLimit;
        System.out.println("Are you speeding? -" + isSpeeding);

        currentSpeed +=20;
        isSpeeding = currentSpeed >= currentSpeed;
        System.out.println("Are you speeding? -" + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println("can i afford? - " + (accountBalance >= itemPrice));

        boolean affordable = accountBalance >= itemPrice;
        System.out.println("Can i afford? -" + affordable);
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i  broke java?-" + isBroke);


    }
}
