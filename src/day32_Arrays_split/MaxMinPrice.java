package day32_Arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        double max = prices[0];
        int indexOfMax = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("Expensive items is " + items[indexOfMax] + "\nPrice: " + max);

        double min = prices[0];
        int indexOfMin = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                indexOfMin = i;
            }
        }
        System.out.println("Least Expensive items is " + items[indexOfMin] + "\nPrice: " + min);
    }
}

