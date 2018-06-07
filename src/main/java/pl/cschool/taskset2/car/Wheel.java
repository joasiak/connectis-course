package pl.cschool.taskset2.car;

public class Wheel {

    private String type;
    private Tire Tire;
    private Direction directionStatus = Direction.GO_FORWARD;

    public Wheel(String type, Tire tire) {
        this.type = type;
        Tire = tire;
    }

    public Direction getDirectionStatus() {
        return directionStatus;
    }

    public void setDirectionStatus(Direction directionStatus) {
        this.directionStatus = directionStatus;
    }

}
