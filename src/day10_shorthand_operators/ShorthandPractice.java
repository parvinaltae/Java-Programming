package day10_shorthand_operators;

public class ShorthandPractice {
    public static void main(String[] args) {
        int n1 = 5;
        n1 += 3;
        System.out.println("n1 = " + n1);
        int cars = 10;
        cars += 3;
        int electricCars = 13;
        cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars = " + cars);

        String word = "Java";
        System.out.println(word);

        word = word + "programming";
        System.out.println("word = " + word);
        
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println(letter);
        letter +=3;
        System.out.println("letter = " + letter);
        letter += 'U';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee ++;
        System.out.println(parkingFee);

    }
}
