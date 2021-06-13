package PracticeProblems;

public class AnimalSpecies {
    String name;
    int population, growthRate;

    public void setInfo(String newName, int newPopulation, int newGrowth) {
    name = newName;
    population = newPopulation;
    growthRate = newGrowth;
    }
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public int getGrowthRate(){
        return growthRate;
    }
    public String toString(){
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population + " million" +
                ", growthRate= %" + growthRate +
                '}';
    }
}
