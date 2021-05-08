package Replit;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int java = 0;
        int python = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.contains("java")){
                sentence = sentence.replaceFirst("java","");
                java++;
            } else if (sentence.contains("python")){
                sentence = sentence.replaceFirst("python", "");
                python++;
            }
        }
        if(java==python){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
