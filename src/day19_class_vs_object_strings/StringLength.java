package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Parvin";
        System.out.println(name.length());
        System.out.println(name.length()>=4); //true
        System.out.println("count= " + name.length());
        System.out.println("testing ".length());
        int count = name.length();
        System.out.println(count);

        String password = "abc123";
        if (password.length()>=6) {
            System.out.println("Valid amazon password");
        }else{
            System.out.println("Invalid password");
        }

        String country = "USA";
        if(country.equals(country.toUpperCase())){
            System.out.println("It's in Upper Case");
        } else {
            System.out.println("Not Uppercase");
        }

    }
}
