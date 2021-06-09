package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlock_Demo st1 = new StaticBlock_Demo(); // static > constructor >15
        StaticBlock_Demo st2 = new StaticBlock_Demo(); // constructor > 20
        StaticBlock_Demo st3 = new StaticBlock_Demo(); // constructor > 25
        System.out.println(StaticBlock_Demo.num); //25


    }
}
