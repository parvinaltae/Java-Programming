package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("----Starting Etsy Search Smoke Test----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResults();
    }
    public static void openBrowser() {
        System.out.println("Open Safari browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Click on Etsy link to open");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Type Wooden Spoon in search box");
    }
    public static void verifyResults() {
        System.out.println("Confirm result match item");
    }
}
