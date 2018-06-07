package pl.cschool.taskset2.figure;

public class Sphere {

    private String name = "sphere";
    private double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double sphereArea() {
        return 4*Math.PI*Math.pow(this.radius,2);
    }

    public double sphereVolume() {
        return 1.33*Math.PI*Math.pow(this.radius,3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "To jest kula " +
                "o promieniu r=" + radius;
    }
}
