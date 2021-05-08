package Replit;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;

        for(int i = 0;i < word.length()-3; i++){
            if(word.contains("java")){
                count++;
                word = word.replaceFirst("java","");
            }
        }
        System.out.println(count);
    }
}
