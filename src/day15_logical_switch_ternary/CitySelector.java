package day15_logical_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Positano";
        if (city.equals("Positano") || city.equals("Paris")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considerting " + city);
        }
        String teacher = "Saim";
        if (teacher.equals("Saim") || city.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Soft skill class with Hands Off Keyboard");
        }
        String company = "Amazon";
        int salary = 100_000;
        if (company.equals("Amazon") || salary >= 100_000) {
            System.out.println("Accept offer");
        } else {
            System.out.println("Search some more");
        }
    }
}
