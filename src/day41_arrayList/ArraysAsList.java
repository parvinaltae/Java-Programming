package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654); // first way
        System.out.println("nums = " + nums);
        // nums.add(100); // ummutable, cannot be changed

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100)); // second way
        numsList.add(33);
        numsList.add(33);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        List<String> dWc = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull",
                "coke", "pepsi", "mdew", "kambucha", "celsius"));
        for (int i = 0; i < dWc.size(); i++) {
            if (dWc.equals("celcius") || dWc.equals("red bull") || dWc.equals("monster")) {
                System.out.println(dWc.get(i) + "= 150mg of caffeine");
            } else if (dWc.equals("coffee") || dWc.equals("kambucha")) {
                System.out.println(dWc.get(i) + "= 112mg of caffeine");
            } else if (dWc.equals("tea") || dWc.equals("coke") ||
                    dWc.equals("pepsi") || dWc.equals("mdew")) {
                System.out.println(dWc.get(i) + "=  35mg of caffeine");
            }
        }
        // new TOPIC FOR EACH
        dWc.forEach(drink-> System.out.println(drink));

        dWc.forEach(drink -> {
            System.out.println("This is forEach block");
            System.out.println("drink = " + drink);
        });
   }
}
