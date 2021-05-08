package day06_Arithmetic_Operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas=431, hondas=233,vw=2,tesla=20,nissan=1,bmw=155;
        int totalCarsInParking= toyotas + hondas + vw + tesla + nissan + bmw;
        System.out.println("There are " + totalCarsInParking + " cars in the parking.");

        String pizza= "hawaiian";
        byte slices= 8;
        byte people=4;
        int slicesPerPerson= slices/ people;
        System.out.println("There are " +slicesPerPerson+ " slices per person.");
        System.out.println("We ordered "+ pizza + " pizza with " + slices + " slices, " + people + " ate " + slicesPerPerson + " slices each.");

    }
}
