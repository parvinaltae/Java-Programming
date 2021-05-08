package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String country = "USA";
        if(country.equals(country.toUpperCase())){
            System.out.println("It's in Uppercase");
        } else {
            System.out.println("Not Uppercase");
        }
    }
}
