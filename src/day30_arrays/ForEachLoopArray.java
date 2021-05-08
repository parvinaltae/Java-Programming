package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {43, 650, 12, 987, 5, 67, 2345, 1};
        for (int eachNum : data) {
            System.out.print(eachNum + " ");
        }
        System.out.println();
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
            System.out.println(data[data.length-1]); // to print last number
        }
        System.out.println();
        for(int j = data.length-1; j >=0; j--) { // print numbers in reverse
            System.out.print(data[j] + " ");
        }
    }
}

