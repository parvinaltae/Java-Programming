package day18_conditions_practicie_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "G63";
        int leasePrice = 0;

        if (make.equals("Mercedes")) {
            if (model.equals("G63")) {
                leasePrice = 700;
            } else if (model.equals("E")) {
                leasePrice = 400;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("A4")) {
                leasePrice = 500;
            } else if (model.equals("A3")) {
                leasePrice = 300;
            } else {
                System.out.println("Invalid match");
                return; // exit main method
            }
        }
    }
}
