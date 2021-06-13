package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName ("YouTube");
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.setName ("Instagram");
        instagram.useTheApp(20);

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.useTheApp(100);

    }
}
