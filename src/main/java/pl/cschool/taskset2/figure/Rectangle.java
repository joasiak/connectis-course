package pl.cschool.taskset2.figure;

public class Rectangle {
    private String name = "rectangle";
    private double recWidth;
    private double recLength;

    public Rectangle(double recWidth, double recLength) {
        this.recWidth = recWidth;
        this.recLength = recLength;
    }

    public Rectangle() {
    }

    public double rectPerimeter(double a, double b) {
        return 2*a+2*b;
    }

    public double rectArea(double a, double b) {
        return a*b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRecWidth() {
        return recWidth;
    }

    public void setRecWidth(double recWidth) {
        this.recWidth = recWidth;
    }

    public double getRecLength() {
        return recLength;
    }

    public void setRecLength(double recLength) {
        this.recLength = recLength;
    }

    @Override
    public String toString() {
        return "To jest prostokąt o wymiarach " +
                "bok a=" + recWidth +
                ", bok b=" + recLength;
    }
}
