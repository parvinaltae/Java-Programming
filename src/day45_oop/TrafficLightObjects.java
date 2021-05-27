package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight light1 = new TrafficLight();
        light1.changeColor("green"); // preferred way by using method vs variable
        light1.showColor();
        light1.changeColor("red");
        light1.showColor();

        TrafficLight light2 = new TrafficLight();
        light2.changeColor("black");
        light2.showColor();
    }
}
