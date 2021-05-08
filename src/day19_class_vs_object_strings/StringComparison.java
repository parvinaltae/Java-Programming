package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Baku";
        System.out.println(city.equals("Baku")); //TRUE
        System.out.println(city.equalsIgnoreCase("baku")); // TRUE
        System.out.println(city.equals("baku")); // FALSE
    }
}
