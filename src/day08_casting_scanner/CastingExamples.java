package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
//        byte short int long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        long num4 = num3;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);
        System.out.println("num9 = " + num9);

        int n1 = 55;
        byte n2 = (byte)n1;

        long num33 = 444L;
        int num34 = (int)num33;
//        soutv -> prints last variable as seen below / sout -> print shortcut
        System.out.println("num34 = " + num34);
        short num35 = (short)num34; 
        System.out.println("num35 = " + num35);
        
        double num15 = 123.45;
        int num16 =(int) num15;
        System.out.println("num16 = " + num16);
//         casting char to int
        char letter = 'P';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);

    }
}
