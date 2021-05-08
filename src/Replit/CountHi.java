package Replit;
import java.util.Scanner;
public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int hiCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.contains("hi")){
                hiCount++;
                str = str.replaceFirst("hi","");
            }
        }
        System.out.println(hiCount);

    }
}
