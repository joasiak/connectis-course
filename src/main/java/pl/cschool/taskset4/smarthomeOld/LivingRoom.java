package pl.cschool.taskset4.smarthomeOld;

import java.util.List;

public class LivingRoom extends AbstractRoom {

    public LivingRoom(String name) {
        super(name);
        this.prepareRoom();
    }

    @Override
    public List<Furniture> prepareRoom() {
        furnitureList.add(Furniture.SZAFKA);
        furnitureList.add(Furniture.SOFA);
        return furnitureList;
    }


}



