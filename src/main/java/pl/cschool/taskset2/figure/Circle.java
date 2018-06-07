package pl.cschool.taskset2.figure;

public class Circle {

    private String name = "circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double circlePerimeter() {
        return 2*Math.PI*this.radius;
    }

    public double circleArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "To jest koło " +
                "o promieniu równym " + radius;
    }
}
