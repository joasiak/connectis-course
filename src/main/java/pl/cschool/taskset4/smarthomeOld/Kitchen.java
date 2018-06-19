package pl.cschool.taskset4.smarthomeOld;

import java.util.HashSet;
import java.util.List;

public class Kitchen extends AbstractRoom {

    private HashSet<String> fridge = new HashSet<>();

    public Kitchen(String name) {
        super(name);
        this.prepareRoom();
    }

    //cook();

    @Override
    public List<Furniture> prepareRoom() {
        furnitureList.add(Furniture.KRZESLO);
        furnitureList.add(Furniture.KRZESLO);
        furnitureList.add(Furniture.KRZESLO);
        furnitureList.add(Furniture.KRZESLO);
        furnitureList.add(Furniture.STOL);
        return furnitureList;
    }

    public boolean canCook() {
        System.out.println("Ugotuj...");
        if (fridge.size()<3) {
            System.out.println("Nie mam potrzebnych produktów.");
            return false;
        }
        System.out.println("Mam produkty. Mogę gotować.");
        return true;
    }

    public HashSet<String> getFridge() {
        return fridge;
    }

    public void setFridge(HashSet<String> fridge) {
        this.fridge = fridge;
    }
}
