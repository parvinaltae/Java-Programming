package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, Css, Selenium, maven, cucumber, SQL";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        System.out.println(technologies.charAt(12));
        int indexOfCSS = technologies.indexOf("Css");

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
            if(technologies.indexOf("ja") > -1 ) { // or >= 0 or != -1
                System.out.println("maven is present");
            }
        }
    }
}

