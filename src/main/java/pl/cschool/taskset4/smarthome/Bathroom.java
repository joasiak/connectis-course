package pl.cschool.taskset4.smarthome;

import java.util.ArrayList;
import java.util.List;

public class Bathroom extends AbstractRoom {

    public Bathroom(String name, List<Furniture> furniture) {
        super(name);
        this.prepareRoom(furniture, FurnitureStatus.ALL_NEW);
    }
}
