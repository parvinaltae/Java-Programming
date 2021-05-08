package day24_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("Even number+ " + i);
            }else{
                System.out.println("Odd number+ " + i);
            }
        }
    }
}
