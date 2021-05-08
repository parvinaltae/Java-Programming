package day41_arrayList;

import java.util.*;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Baku");
        cities.add("LA");
        // add new city to first index
        cities.add(0, "Positano");
        System.out.println(cities);
        System.out.println(("First city = " + cities.get(0)));
        System.out.println("Last city = " + cities.get(cities.size() - 1));
        // print count of items in arrayList
        System.out.println("Count of items = " + cities.size());

        for (int i = 0; i < cities.size() / 2; i++) {
            System.out.print(cities.get(i) + ",");
        }
        for (String each : cities) {
            System.out.println(each + " ");
        }
        cities.remove(3); // removing using index
        cities.remove("New York"); // using object/value

        System.out.println(cities);
        cities.clear();
        System.out.println(cities);


    }
}
