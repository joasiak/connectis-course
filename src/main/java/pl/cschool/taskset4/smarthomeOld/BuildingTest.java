package pl.cschool.taskset4.smarthomeOld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    HashSet<String> lodowka = new HashSet<>();
    ArrayList<String> szafka = new ArrayList<>();

    AbstractRoom kitchen = new Kitchen("kuchania");
    AbstractRoom bedroom = new Bedroom("sypialnia");
    AbstractRoom livingroom = new LivingRoom("salon");
    AbstractRoom bathroom = new Bathroom("lazienka");

    HashSet<AbstractRoom> firstFloorRooms = new HashSet<>();
    HashSet<AbstractRoom> secondFloorRooms = new HashSet<>();

    Floor firstFloor = new Floor("pierwsze pietro", firstFloorRooms);
    Floor secondFloor = new Floor("drugie pietro", secondFloorRooms);

    ArrayList<Floor> floors = new ArrayList<>();

    Building chatkaPuchatka = new Building("ChatkaPuchatka", floors);

    @Before
    public void setUp()
    {
        firstFloorRooms.add(kitchen);
        firstFloorRooms.add(livingroom);
        secondFloorRooms.add(bathroom);
        secondFloorRooms.add(bedroom);

        floors.add(firstFloor);
        floors.add(secondFloor);

        HashSet<String> fridge = new HashSet<>();
        fridge.add("makaron");
        fridge.add("pesto");
        fridge.add("oliwki");

        ((Kitchen) kitchen).setFridge(fridge);
    }

    @Test
    public void test1() {
        assertEquals(true, ((Kitchen) kitchen).canCook());
        assertEquals(true, ((Bedroom) bedroom).spij());
    }

    @Test
    public void closeAllWindowsAndDoorsTest() {

        for (Iterator<Floor> itFloor = chatkaPuchatka.getFloorList().iterator(); itFloor.hasNext();) {
            Floor floor = itFloor.next();
            for (Iterator<AbstractRoom> itRoom = floor.getRoomSet().iterator(); itRoom.hasNext();){
                AbstractRoom room = itRoom.next();
                    room.open();
                }
        }
        chatkaPuchatka.closeAllWindowsAndDoors();
        for (Floor f : chatkaPuchatka.getFloorList()) {
            for (AbstractRoom r : f.getRoomSet()) {
                Assert.assertEquals(CloseOpenStatus.ZAMKNIETE, r.getdStatus());
                Assert.assertEquals(CloseOpenStatus.ZAMKNIETE, r.getwStatus());
            }
        }
    }

    @Test
    public void checkBuildingTest() {

        kitchen.open();
        Alarm.uzbroj();
        Alarm.checkBuilding(chatkaPuchatka);
        assertEquals(AlarmStatus.WLACZONA_WYJE, Alarm.getSyrena());
        chatkaPuchatka.closeAllWindowsAndDoors();
        Alarm.checkBuilding(chatkaPuchatka);
        Alarm.turnOffAlarm(chatkaPuchatka);
        assertEquals(AlarmStatus.WYLACZONA, Alarm.getSyrena());
    }

}
