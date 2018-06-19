package pl.cschool.taskset4.smarthome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.cschool.taskset3.audio.OnOffStatus;
import pl.cschool.taskset3.clock.AlarmClockStatus;
import pl.cschool.taskset3.microwave.OvenFunction;
import pl.cschool.taskset3.microwave.PowerStatus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    HashSet<String> lodowka = new HashSet<>();
    ArrayList<String> szafka = new ArrayList<>();

    List<Furniture> bedroomFurniture = new ArrayList<>();
    List<Furniture> livingroomFurniture = new ArrayList<>();
    List<Furniture> bathroomFurniture = new ArrayList<>();
    List<Furniture> kitchenFurniture = new ArrayList<>();

    AbstractRoom kitchen = new Kitchen("kuchania", kitchenFurniture);
    AbstractRoom bedroom = new Bedroom("sypialnia", bedroomFurniture);
    AbstractRoom livingroom = new LivingRoom("salon", livingroomFurniture);
    AbstractRoom bathroom = new Bathroom("lazienka", bathroomFurniture);

    HashSet<AbstractRoom> firstFloorRooms = new HashSet<>();
    HashSet<AbstractRoom> secondFloorRooms = new HashSet<>();

    Floor firstFloor = new Floor("pierwsze pietro", firstFloorRooms);
    Floor secondFloor = new Floor("drugie pietro", secondFloorRooms);

    ArrayList<Floor> floors = new ArrayList<>();

    Building chatkaPuchatka = new Building("ChatkaPuchatka", floors);

    @Before
    public void setUp()
    {
        livingroomFurniture.add(Furniture.SOFA);
        livingroomFurniture.add(Furniture.SZAFKA);

        bedroomFurniture.add(Furniture.LOZKO);
        bedroomFurniture.add(Furniture.SZAFA);

        kitchenFurniture.add(Furniture.KRZESLO);
        kitchenFurniture.add(Furniture.KRZESLO);
        kitchenFurniture.add(Furniture.KRZESLO);
        kitchenFurniture.add(Furniture.KRZESLO);
        kitchenFurniture.add(Furniture.STOL);

        bathroomFurniture.add(Furniture.UMYWALKA);
        bathroomFurniture.add(Furniture.WANNA);


        firstFloorRooms.add(kitchen);
        firstFloorRooms.add(livingroom);
        secondFloorRooms.add(bathroom);
        secondFloorRooms.add(bedroom);

        floors.add(firstFloor);
        floors.add(secondFloor);

    }

    @Test
    public void test1() {
        List<Furniture> newFernitureBedroom = new ArrayList<>();
        newFernitureBedroom.add(Furniture.KRZESLO);
        newFernitureBedroom.add(Furniture.STOLIK);
        bedroom.prepareRoom(newFernitureBedroom, FurnitureStatus.ADD_TO_GIVEN);
        assertEquals(4, bedroom.getFurnitureList().size());
        assertEquals(true, bedroom.getFurnitureList().containsAll(newFernitureBedroom));
    }

    @Test
    public void test2() {
        HashSet<String> fridge = new HashSet<>();
        fridge.add("makaron");
        fridge.add("pesto");
        fridge.add("oliwki");
        fridge.add("cebula");
        fridge.add("maslo");
        fridge.add("mleko");

        ((Kitchen) kitchen).setFridge(fridge);
        ((Kitchen) kitchen).cook(160, 5, OvenFunction.GRILL);

        assertEquals(true,((Kitchen) kitchen).canCook());

        assertEquals(PowerStatus.ON,((Kitchen) kitchen).myOven.getPowerStatus());
        assertEquals(OvenFunction.GRILL,((Kitchen) kitchen).myOven.getOvenFunctionStatus());
    }

    @Test
    public void test3() {

        ((Bedroom) bedroom).alarmClockOn();
        assertEquals(AlarmClockStatus.ON, ((Bedroom) bedroom).myClock.getAlarmStatus());
        ((LivingRoom) livingroom).myAudio.turnOn();
        assertEquals(OnOffStatus.ON,((LivingRoom) livingroom).myAudio.getStatus());
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
