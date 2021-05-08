package Replit;
import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(0);
            count++;
            System.out.println(word.substring(i, i +1));
        }
    }
}
