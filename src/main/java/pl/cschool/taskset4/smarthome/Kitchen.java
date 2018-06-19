package pl.cschool.taskset4.smarthome;

import pl.cschool.taskset3.microwave.Oven;
import pl.cschool.taskset3.microwave.OvenFunction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kitchen extends AbstractRoom {

    private HashSet<String> fridge = new HashSet<>();
    Oven myOven = new Oven();

    public Kitchen(String name, List<Furniture> furniture) {
        super(name);
        prepareRoom(furniture, FurnitureStatus.ALL_NEW);
    }

    public boolean canCook() {
        if (fridge.size()<5) {
            return false;
        }
        return true;
    }

    public void cook(int temp, int time, OvenFunction f) {
        if (canCook()) {
            myOven.turnOn();
            myOven.powerTimeTypeSetter(temp, time, f);
        }
    }

    public HashSet<String> getFridge() {
        return fridge;
    }

    public void setFridge(HashSet<String> fridge) {
        this.fridge = fridge;
    }
}
