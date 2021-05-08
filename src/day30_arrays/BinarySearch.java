package day30_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {56,89,400,689};
        System.out.println(Arrays.binarySearch(num, 400));

        if(Arrays.binarySearch(num, 689) >= 0){
            System.out.println("Value is there");


            int[] num1 = {56,89,400,689};
            int[] num2 = {56,89,400,689};
            System.out.println(Arrays.equals(num1,num2));
            }

        }
    }

