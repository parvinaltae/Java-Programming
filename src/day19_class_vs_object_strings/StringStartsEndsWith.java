package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "sunny";
        System.out.println(word.startsWith("s")); // true
        System.out.println(word.endsWith("ny")); // true
        System.out.println(word.startsWith("ny")); //false

        String url = "www.pbskids.org";
        if (url.endsWith(".com")){
            System.out.println("Commercial web");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian web");
        }else if(url.endsWith(".gov")){
            System.out.println("Government web");
        }else if(url.endsWith(".edu")){
            System.out.println("Education web");
        }else if(url.endsWith(".org")){
            System.out.println("Organization web");
        }
    }
}
