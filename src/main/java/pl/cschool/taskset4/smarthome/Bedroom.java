package pl.cschool.taskset4.smarthome;

import pl.cschool.taskset3.clock.AlarmClock;

import java.util.List;

public class Bedroom extends AbstractRoom {

    AlarmClock myClock = new AlarmClock();

    public Bedroom(String name, List<Furniture> furniture) {
        super(name);
        prepareRoom(furniture, FurnitureStatus.ALL_NEW);
    }

    public void alarmClockOn() {
        myClock.alarmOn();
    }
}
