package pl.cschool.taskset4.smarthome;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRoom {

    private String name;
    private CloseOpenStatus wStatus = CloseOpenStatus.ZAMKNIETE;
    private CloseOpenStatus dStatus = CloseOpenStatus.ZAMKNIETE;

    private List<Furniture> furnitureList = new ArrayList<>();

    public AbstractRoom(String name) {
        this.name = name;
    }

    public void open() {
        wStatus=CloseOpenStatus.OTWARTE;
        dStatus=CloseOpenStatus.OTWARTE;
    }

    public void close() {
        wStatus=CloseOpenStatus.ZAMKNIETE;
        dStatus=CloseOpenStatus.ZAMKNIETE;
    }

    public void prepareRoom(List<Furniture> furniture, FurnitureStatus s) {
        if (s==FurnitureStatus.ALL_NEW) {
            this.furnitureList.removeAll(furnitureList);
            this.furnitureList = furniture;
        }
        else furnitureList.addAll(furniture);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloseOpenStatus getwStatus() {
        return wStatus;
    }

    public void setwStatus(CloseOpenStatus wStatus) {
        this.wStatus = wStatus;
    }

    public CloseOpenStatus getdStatus() {
        return dStatus;
    }

    public void setdStatus(CloseOpenStatus dStatus) {
        this.dStatus = dStatus;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(ArrayList<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
    }
}
