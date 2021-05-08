package day41_arrayList;
import java.util.*;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Mercedes");
        myCars.add("BMW");
        myCars.add("Toyota");
        myCars.add("Lexus");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add(1, "Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars); // or myCars.toString()
        String allCarsIn1Str = myCars.toString(); // saves all cars in one String variable
        System.out.println(allCarsIn1Str);
        // change index 0 to Lambo
        myCars.set(0, "Lambo");
        myCars.set(4, "Honda");
        System.out.println("After set honda = " + myCars.toString()); // or just myCars
        /**
         * * How would you do that if myCars was array?
         * myCars[4] = "Honda
         */
        String str = "java";
        str.indexOf("v");

        //System.out.println("index of Lexus = " + myCars.indexOf("Lexus"));
        //myCars.set(myCars.indexOf("Ford"), "Trabant");
        //System.out.println(myCars);

        //if(myCars.contains("Jeep")){
           // myCars.set(myCars.indexOf("Jeep"), "Bugatti");
        //} else {
           // System.out.println("Jeep is not found");
       // }
        //System.out.println(myCars.toString());

        for(int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equalsIgnoreCase("Lambo")){
                myCars.set(i, "Prius");
            } else if(myCars.get(i).equals("lada")) {
                myCars.set(i, "lexus");
            }else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println(myCars);
        }
    }
