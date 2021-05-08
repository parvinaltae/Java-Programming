package Replit;
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestList = "";
        String yesNo;

        System.out.println("Please enter guest name: ");
        String newGuest = input.nextLine();
        newGuest += newGuest + " ,";

        do {
            System.out.println("Do you want to enter new guest name: ");
            yesNo = input.next();
            if(yesNo.equals("yes")) {
                System.out.println("Please enter guest name: ");
                newGuest = input.next();
                guestList += newGuest;
            }else if (yesNo.equals("no"))
                System.out.println("Guest's list: " + guestList);
        } while (yesNo.equals("yes"));
    }
}
