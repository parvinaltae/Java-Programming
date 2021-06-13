package PracticeProblems;

public class AnimalSpeciesObjects {
    public static void main(String[] args) {
        AnimalSpecies animal1 = new AnimalSpecies();
        animal1.setInfo("Cheetah",1, 32);

        System.out.println(animal1.toString());

        AnimalSpecies animal2 = new AnimalSpecies();
        animal2.setInfo("Penguin", 12, 35);
        System.out.println(animal2.toString());
    }
}
