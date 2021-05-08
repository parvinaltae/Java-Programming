package PracticeProblems;

public class PasswordUsername {
    public static void main(String[] args) {
        String password = "123";
        String username = "SDET";

        if (password.length() <5) {
            System.out.println("Password can't be less than 5 characters");
        } else if (password.length() <=5 && !password.contains(username)) {
            System.out.println("Valid password");
        } else if (password.contains(username)) {
            System.out.println("Invalid password, username should not be in it");
            password = "password";
        }
    }
}
