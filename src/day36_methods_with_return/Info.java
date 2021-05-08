package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        String name = fullName();
        System.out.println(name);

    }

    public static String fullName() {
        return "Parvin Altae";
    }

    public static boolean isMarried() {
        return true;
    }

    public static int getAge() {
        return 26;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
