package day29_NestedLoops;

public class TimeNestedLoop {
    public static void main(String[] args) {

        /*for(int minutes =0; minutes <= 5; minutes++){
            System.out.println("\nminutes = " + minutes);

            for(int seconds = 1; seconds<60; seconds++){
               System.out.print(seconds+ " "); */

        for(int minutes = 0; minutes <=4; minutes++){
            for(int seconds = 0; seconds < 60; seconds++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}


