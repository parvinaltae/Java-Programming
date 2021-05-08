package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        int apples = 0;
        while (apples <= 3) {
            System.out.println("apple ->" + apples); // runs 1 ,2 3
            apples++; // 4 apples
        }
    }
}
