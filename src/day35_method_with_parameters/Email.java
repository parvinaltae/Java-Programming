package day35_method_with_parameters;

public class Email {
    public static void main(String[] args) {
        buildEmail("Parvin", "gmail");
        buildEmail("John ward iii", "verizon");
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        System.out.println(name + "@" + domain + ".com");

    }
}
