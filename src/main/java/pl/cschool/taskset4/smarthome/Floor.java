package pl.cschool.taskset4.smarthome;

import java.util.HashSet;

public class Floor {

    private String name;
    private HashSet<AbstractRoom> roomSet;

    public Floor(String name,  HashSet<AbstractRoom> roomSet) {
        this.name = name;
        this.roomSet = roomSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<AbstractRoom> getRoomSet() {
        return roomSet;
    }

    public void setRoomSet(HashSet<AbstractRoom> roomSet) {
        this.roomSet = roomSet;
    }

}
