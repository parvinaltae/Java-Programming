package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println(shoppingList.size());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }
        int count = shoppingList.size();
        System.out.println("Item to buy = " + count);

        System.out.println("Is shoes in my list? " + shoppingList.contains("shoes"));
        shoppingList.remove("shoes");
        System.out.println(shoppingList);
        shoppingList.clear(); // list cleared

    }
}
