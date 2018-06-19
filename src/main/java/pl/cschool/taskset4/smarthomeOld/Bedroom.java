package pl.cschool.taskset4.smarthomeOld;

import java.util.List;

public class Bedroom extends AbstractRoom {

    public Bedroom(String name) {
        super(name);
        this.prepareRoom();
    }

    @Override
    public List<Furniture> prepareRoom() {
        furnitureList.add(Furniture.LOZKO);
        furnitureList.add(Furniture.SZAFA);
        return furnitureList;
    }

    public boolean spij() {
        if (furnitureList.contains(Furniture.LOZKO)) {
            System.out.println("Będę spać");
            return true;
        }
        System.out.println("Tutaj nie ma łóżka!");
        return false;
    }

}
