package Replits_April13;
import java.util.*;
public class largestWord {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            for(int i = 0; i < 5;  i++) {

                words[i] = input.nextLine();
            }
            String longestWord = words[0];
            for(String each : words){
                if(each.length() > longestWord.length()){
                    longestWord = each;
                }
            }
        System.out.println(longestWord);
    }
}
