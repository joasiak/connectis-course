package pl.cschool.taskset4.smarthome;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Floor> floorList;
    private Alarm alarm;

    public Building(String name, ArrayList<Floor> floorList) {
        this.name = name;
        this.floorList = floorList;
    }

    public void closeAllWindowsAndDoors() {
        for (Floor f : floorList) {
            for (AbstractRoom r : f.getRoomSet()) {
                r.setdStatus(CloseOpenStatus.ZAMKNIETE);
                r.setwStatus(CloseOpenStatus.ZAMKNIETE);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(ArrayList<Floor> floorList) {
        this.floorList = floorList;
    }
}
