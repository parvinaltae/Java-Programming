package Replits_April13;

import java.util.*;

public class PopulateNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));
    }
    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        String str = "";
        for(String each : arr){
            if(each.contains("e")) {
                str += each + " ";
            }
        }
        String[] fewValues = str.trim().split(" ");
        //YOUR CODE ENDS HERE -----------------------
        return fewValues;
    }
    }
