package day52_inheritance;

public class Discord extends MobileApp {
    public void chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }
    public void printInfo(){
        System.out.println("App name " + getName());
        System.out.println("App Version = " + getVersion());
    }
}
