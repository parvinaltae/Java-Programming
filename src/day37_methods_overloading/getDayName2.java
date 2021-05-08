package day37_methods_overloading;

public class getDayName2 {
    public static void main(String[] args) {
        System.out.println(getDayName2(3));
    }

    public static String getDayName2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wed";
                break;
            case 4:
                dayName = "Thur";
                break;
            case 5:
                dayName = "Fri";
                break;
            case 6:
                dayName = "Sat";
                break;
            case 7:
                dayName = "Sun";
                break;
            default:
                System.out.println("Invalid day: " + day);
                dayName = null;
        }
        return dayName;
    }
}
