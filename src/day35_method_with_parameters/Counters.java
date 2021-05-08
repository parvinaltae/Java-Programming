package day35_method_with_parameters;

public class Counters {
    public static void main(String[] args) {
        count(7);
        int num2 = 999;
        count(num2);
        String word = "wooden spoon";
        count(word.length()); // print up to 12
        printAge(1995);
    }
    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void printAge(int year){
        int age = 2021 - year;
            System.out.println("Birth year: "+ year + "\nAge:" + age);
    }
}

