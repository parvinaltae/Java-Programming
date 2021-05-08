package Replit;

import java.util.*;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        for(int i = 0; i < words.length; i++){
            for( int j = 0; j < words[i].length(); j++ ){
                if(j==0 || j==words[i].length()-1){
                    System.out.println(words[i].charAt(j) + "");
                }
            }
            System.out.println();
        }



    }
}
