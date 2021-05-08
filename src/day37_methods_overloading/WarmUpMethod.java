package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");
    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (secretUsername.equals(username) && secretPassword.equals(password)) {
            System.out.println("Login successful, welcome Cybertek Student!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (secretUsername.equals(username) && secretPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}

