package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count--);
        }
        System.out.println("Done");

        int unreadSMS = 10;
        while (unreadSMS >   0) {
            System.out.println(" unreadSMS : " + unreadSMS--);
        }
        System.out.println("Zero unread messages");
    }
}

