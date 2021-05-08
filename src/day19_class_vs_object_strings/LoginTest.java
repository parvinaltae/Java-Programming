package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "SDET123";
        String userName = "Cybertek";
        String password = "SDET123";

        if(userName.equalsIgnoreCase(expUserName) && password.equals(expPassword)){
            System.out.println("Logged in");
        }else if(userName.equalsIgnoreCase(expUserName)){
            System.out.println("Invalid username!");
        }else {
            System.out.println("Invalid password!");
        }
        }
    }
