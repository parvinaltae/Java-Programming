package day45_oop;

public class Coffee {
    String type;
    int amount;

    public void refill() {
        amount = 100;
        System.out.println("Set amount = " + amount);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void drink(int someAmount) {
        if (someAmount < amount) {
            amount -= someAmount;
        } else {
            System.out.println("Error");
        }
    }

    public int getAmount() {
        return amount;
    }
    public void setType(String newType){
        type = newType;
        System.out.println("Coffee type = " + newType);
    }
    public String getType(){
        return type;
    }
}

