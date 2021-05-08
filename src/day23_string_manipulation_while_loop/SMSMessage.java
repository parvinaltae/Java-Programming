package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir] From Number<2223334444> Message:{Hello, lets code some java}";

        String sender = message.substring(message.indexOf('[') + 1, message.indexOf(']'));
        String number = message.substring(message.indexOf('<') + 1, message.indexOf('>'));
        String text = message.substring(message.indexOf('{') + 1, message.indexOf('}'));

        System.out.println("sender = " + sender);
        System.out.println("number = " + number);
        System.out.println("text = " + text);
    }
}
