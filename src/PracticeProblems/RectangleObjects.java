package PracticeProblems;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setDimensions(3.2,8.7);
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setDimensions(12,24);
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2);
    }
}
