package PracticeProblems;
import java.util.*;
public class Practice_3_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String word = str.substring(0, n);
        String lastWord = str.substring(word.length()+1);
        if ( lastWord.contains(word)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        }
    }

