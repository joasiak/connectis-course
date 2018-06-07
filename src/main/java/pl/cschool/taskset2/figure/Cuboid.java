package pl.cschool.taskset2.figure;

public class Cuboid {

    private String name = "cuboid";
    private double cubWidth;
    private double cubLength;
    private double cubHeight;

    public Cuboid() {
    }

    public Cuboid(double cubWidth, double cubLength, double cubHeight) {
        this.cubWidth = cubWidth;
        this.cubLength = cubLength;
        this.cubHeight = cubHeight;
    }

    public double cuboidArea(double a, double b, double H) {
        return 2*a*b + 2*b*H + 2*a*H;
    }

    public double cuboidVolume(double a, double b, double H) {
        return a * b * H;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCubWidth() {
        return cubWidth;
    }

    public void setCubWidth(double cubWidth) {
        this.cubWidth = cubWidth;
    }

    public double getCubLength() {
        return cubLength;
    }

    public void setCubLength(double cubLength) {
        this.cubLength = cubLength;
    }

    public double getCubHeight() {
        return cubHeight;
    }

    public void setCubHeight(double cubHeight) {
        this.cubHeight = cubHeight;
    }

    @Override
    public String toString() {
        return "To jest prostopadłościan: " +
                "o wymiarach: " +
                "szerokość = " + cubWidth +
                ", długość = " + cubLength +
                ", wysokość = " + cubHeight ;
    }

}
