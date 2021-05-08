package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println(letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.frequency(letters, 'a')); //checks how many a's are in the arraylist

        int vCount = Collections.frequency(letters, 'v');
        System.out.println(vCount);

        System.out.println(Collections.max(letters)); // max Number
        System.out.println(Collections.min(letters)); // min

        Collections.replaceAll(letters, 'a','u'); // replace a with u
        System.out.println(letters);

        Collections.sort(letters); // returns null so can not be printed

        List<Integer> nums = Arrays.asList(23,4,68,26,5,-9,0,5,78,6,5);

        System.out.println(Collections.frequency(nums,5)); // how many 5's in array nums?

        Collections.replaceAll(nums,5,1);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);

    }
}
