package pl.cschool.taskset2.laptop;

public class Processor {

    private String type;
    private double speed;

    public Processor(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    public Processor() {
        System.out.println(this.toString());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor " +
                type +
                " częstotliwość " + speed +
                " GHz";
    }
}
