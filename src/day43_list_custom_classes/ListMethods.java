package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays().size()); // 7
        List<String> dayNames = getDays(); // assign to variable
        System.out.println(dayNames);

        dayNames.removeIf(day -> day.length()==6); // how to remove
        System.out.println("daynames = " + dayNames);
        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(d -> d.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        nums.removeIf(n -> n < 90); // remove nums less than 90
    }

    public static List<String> getDays() {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"
                , "Thursday", "Friday", "Saturday", "Sunday"));
    return days;
}
    public static List<Integer> getRandomList(int size){
        Random random = new Random(); // random object with 0-100 limit
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= size; i++){
        nums.add(random.nextInt(101)); // generate random number and add to list
        }
        return nums;
    }
}

