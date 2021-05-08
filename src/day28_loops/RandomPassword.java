package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLOMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random randomNum = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = randomNum.nextInt(71);
            System.out.println(source.charAt(index));
            //source.substring(index, index +1);
            password += source.charAt(index);
            //System.out.println(random.nextInt(source.length()));
        }
        System.out.println("\nYour password = " + password);
    }
}
