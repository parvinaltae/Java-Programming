package PracticeProblems;
public class ArmyProblem {
    public static void main(String[] args) {
        String citizenship = "citizen";
        boolean resident = false;
        boolean diploma = true;
        int age = 33;

        if (citizenship.equalsIgnoreCase("Citizen") || resident) {
            if (age >= 18 && age <= 35) {
                if (diploma) { // all above if's must be true to print true statement
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }
            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }
        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }
    }
}
