package pl.cschool.taskset2.figure;

public class Sphere {

    private String name = "sphere";
    private double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double sphereArea(double r) {
        return 4*Math.PI*Math.pow(r,2);
    }

    public double sphereVolume(double r) {
        return (4/3)*Math.PI*Math.pow(r,3);
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
