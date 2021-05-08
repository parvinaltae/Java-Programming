package day13_conditional_statements;

public class NiceDayOrNot {
    public static void main(String[] args) {
        int temp = 71;
        if (temp >= 70) {
            System.out.println("It's a beautiful day!\nLet's code java");
        } else {
            System.out.println("It is kind of cold today\nStay home and code java");
        }
        int bonus = 0;
        int salesAmount = 2000;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }
    }
}
