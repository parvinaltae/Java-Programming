package Replits_April13;
import java.util.*;
public class ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortestStr = str[0];
        String tempStr = "";
        for (int i = 1; i < str.length; i++) {
            tempStr = str[i];
            for (int j = 0; j < tempStr.length(); j++) {
                if (tempStr.length() < shortestStr.length()){
                    shortestStr = tempStr;
                }
            }
        }
        System.out.println(shortestStr);
    }
    }

