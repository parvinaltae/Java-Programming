package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num += 10;

        Integer n = new Integer(500);
        System.out.println("Is n 500?= " + n.equals(500));
        System.out.println(n+300);

        Integer intObject = 1000;
        System.out.println(intObject / 50);
        System.out.println(intObject.toString());

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short sh1 = new Short((short)40);
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300L);
        Long l2 = 3455L;
        Float fl1 = new Float(5.2F);
        Float fl12 = 45.3F;
        Double d1 = new Double(345.3);
        Character ch1 = new Character('Q');
        Character ch2 = 'V';
        ch1.toString();
        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

;    }
}
