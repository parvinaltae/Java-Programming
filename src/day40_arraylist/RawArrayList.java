package day40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //1 way
        List list2 = new ArrayList(); // 2nd way -> more commonly used
        // add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(65.89);
        list1.add(true);

        System.out.println(list1);
        System.out.println("size" + list1.size());
    }



}
