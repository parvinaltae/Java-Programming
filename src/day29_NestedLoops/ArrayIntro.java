package day29_NestedLoops;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] num = new int[3]; // 3 determines size of array
        num[0] = 5;
        num[1] = 7;
        num[2] = 10;
        System.out.println("Value at index 0 is " + num[0]);
        System.out.println("Value at index 1 is " + num[1]);
        System.out.println("Value at index 2 is " + num[2]);

        System.out.println("number of elements = " + num.length); // prints length of array
        int len = num.length; // storing length of array to a new variable

        num[0] = 10;
        num[1] =20;
        num[2] = num[1]; // reassigning values

    }
}
