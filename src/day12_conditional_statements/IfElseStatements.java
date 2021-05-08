package day12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args){
    if (10 > 5) {
        System.out.println("CONDITION IS TRUE");
    } else {
        System.out.println("CONDITION NOT TRUE");
    }
    int count = 25;
    if (count>30){
        System.out.println("CONDITION IS TRUE");
    } else {
        System.out.println("CONDITION IS NOT TRUE");
    }

    byte age = 10;
    if (age >+ 18) {
        System.out.println("Eligible to vote");
        System.out.println("Age is greater or equal to 18");
    }else{
        System.out.println("Not Eligible");
        System.out.println("Age is less than 18");
    }
    }
}
