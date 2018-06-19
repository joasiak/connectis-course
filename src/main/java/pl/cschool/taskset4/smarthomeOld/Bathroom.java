package pl.cschool.taskset4.smarthomeOld;

import java.util.List;

public class Bathroom extends AbstractRoom {

    public Bathroom(String name) {
        super(name);
        this.prepareRoom();
    }

    @Override
    public List<Furniture> prepareRoom() {
        furnitureList.add(Furniture.UMYWALKA);
        furnitureList.add(Furniture.WANNA);
        return furnitureList;
    }
}
