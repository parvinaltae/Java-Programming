package day46_encapsulation;

public class Car {
    // encapsulated/ hidden instance variables
    private String model;
    private int year;
    private int mileage;

    // setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    // getter method
    public String getModel(){
        return model;
}
    //setter for year
    public void setYear(int year) {
        this.year = year;
    }
    // getter method
    public int getYear(){
        return year;
    }
    //Setter method for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    //Getter method for mileage
    public double getMileage(){
        return mileage;
    }

}
