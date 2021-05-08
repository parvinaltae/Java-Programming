package PracticeProblems;

public class DecrementPractice {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        //      5  + 6 + 5 * 2 + 5 + 6
        System.out.println(a);
        System.out.println(b);
        //a =6
        int c = a-- + 3 * a + --a + ++a;
        //      6   + 3 * 5 +   4 + 5
        System.out.println(c);

    }
}
