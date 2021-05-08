package PracticeProblems;

public class PrePostIncrements {
    public static void main(String[] args) {
        int a = 5;
        int b = a-- + a + 5 * 2 + ++a +2;
        //      5 + 4 + 5 * 2 + 5 + 2;
              //  5 + 4 + 10 + 5 + 2
        // 26

    }
}
