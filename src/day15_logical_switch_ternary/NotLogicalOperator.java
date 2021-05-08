package day15_logical_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if (!(age >7)) {
            System.out.println("Need to sit in child car seat");
        }
        boolean isSmokingPermitted = false;
        if(!(isSmokingPermitted)) {
            System.out.println("You can smoke here");
        } else {
            System.out.println("You are not permitted to smoke here");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Wrong password");
        }
    }
}
