package PracticeProblems;

public class CoolName {
    public static void main(String[] args) {
        String name = "Parvin";

        if (name.startsWith("a") || name.startsWith("z")) {
            System.out.println("Your name is cool");
        } else if (name.endsWith("m")) {
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry mom, you didn't give me a cool name");
        }
    }
}
