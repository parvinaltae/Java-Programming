package PracticeProblems;

public class Rectangle {
    Double width, height, area;

    public void setDimensions(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
        area = newWidth * newHeight;

}
    public double getArea() {
        return area;
    }
    public String toString() {
        return "Rectangle " +
                "width = " + width + ", height= "
                + height + ", area= " + area;
    }
}

