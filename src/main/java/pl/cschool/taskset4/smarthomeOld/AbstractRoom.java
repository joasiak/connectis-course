package pl.cschool.taskset4.smarthomeOld;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRoom {

    private String name;
    private CloseOpenStatus wStatus = CloseOpenStatus.ZAMKNIETE;
    private CloseOpenStatus dStatus = CloseOpenStatus.ZAMKNIETE;

    List<Furniture> furnitureList = new ArrayList<>();

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

    public abstract List<Furniture> prepareRoom();

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
