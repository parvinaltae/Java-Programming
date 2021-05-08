package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I am hungry, I will go get something to eat.\nThen code java.");
        } else {
            System.out.println("I am not hungry, Let's keep coding java");
        }
        double price = 130.44;
        double balance = 200;
        boolean isAffordable = price >= balance;
        if (isAffordable) {
            System.out.println("You can afford");
        } else {
            System.out.println("You can not afford");
        }


        boolean isRemoteJob = true;
        if (!isRemoteJob) {
            System.out.println("Sorry I am not interested.");
        }else{
            System.out.println("Sure I am interested, what is the interview process");
        }


    }
}
