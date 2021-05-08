package day10_shorthand_operators;

public class IncrementDecrementOp {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i; // increasing by 1
        System.out.println("i = " + i);

        int lineOfCode = 15;
        lineOfCode = lineOfCode + 1;
        lineOfCode +=1;
        lineOfCode ++;
        ++lineOfCode;
        System.out.println("lineOfCode = " + lineOfCode);
        
        lineOfCode = 10;
        lineOfCode = lineOfCode - 1;
        lineOfCode -=1;
        lineOfCode --;
        --lineOfCode;
        System.out.println("lineOfCode = " + lineOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter --; letter --; letter++; letter++;
        System.out.println("letter = " + letter);

        long a = 3_000L;
        double b = (float)a;
        System.out.println("b = " + b);

        float c = 100.987_6543f;
        short d = (short)c;
        byte e = (byte)d;
        System.out.println("e = " + e);

        int z = 100;
        double x = 123;
        float f = 300;

        System.out.println("kjagfk" + (1) + (2));


    }
}
