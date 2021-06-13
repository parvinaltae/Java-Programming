package day45_oop;

public class TrafficLight {
        String color;
        // this is read only method, displays value of color variable
        public void showColor() {
            System.out.println("Display color = " + color);
        }
        // this method updated the value of color variable
        public void changeColor(String newColor) {
            color = newColor;
            System.out.println("Changing color to = " + newColor);
            if(newColor.equals("red") || newColor.equals("green") || newColor.equals("yellow")){
                color = newColor;
            } else {
                System.out.println("ERROR: Invalid Color");
            }

        }

    }

