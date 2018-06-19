package pl.cschool.taskset4.vehicleservice;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VehicleRegisterServiceTestSuite {

    RegisterMenager carService = new RegisterMenager();

    @Test
    public void test1() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2002-02-03"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        assertEquals(1, carService.carMap.size());
        assertEquals(vehicle1, carService.getCarById(1));
    }

    @Test
    public void test2() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FIESTA, LocalDate.parse("2002-09-23"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        assertEquals(1, carService.carMap.size());
        carService.deleteCarById(vehicle1.getId());
        assertEquals(0, carService.carMap.get(District.MAZOWIECKIE).size());
    }

    @Test
    public void test3() {

        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2002-12-03"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        System.out.println(carService.carMap.values());
        vehicle1 = new PassengerCar(vehicle1.getId(),MakeModelEnum.FORD_FOCUS, LocalDate.parse("2012-05-03"), District.MAZOWIECKIE);
        carService.updateCar(vehicle1.getId(), vehicle1);
        System.out.println(carService.carMap.values());
        assertEquals(1, carService.carMap.size());
        assertEquals(vehicle1, carService.getCarById(vehicle1.getId()));
    }

    @Test
    public void test5() {
        carService.addCar(new Bus(MakeModelEnum.SOLARIS, LocalDate.parse("2002-03-03"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4,LocalDate.parse("2013-10-03"), District.MAZOWIECKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2017-07-18"), District.PODLASKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2010-07-19"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6,LocalDate.parse("2009-10-25"), District.SLASKIE));

        assertEquals(2, carService.findByDistrict(District.MAZOWIECKIE).size());
    }

    @Test
    public void test6() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-11-26"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2013-06-15"), District.MAZOWIECKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2017-08-12"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2010-12-03"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2009-03-09"), District.SLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2018-05-27"),District.WARMINSKO_MAZURSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-12-15"),District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2011-01-03"),District.MALOPOLSKIE));

        assertEquals(4, carService.findOlderThan(2012).size());
    }

    @Test
    public void test7() {
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, 2002, District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, 2015,District.MALOPOLSKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, 2010, District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, 2018,District.WARMINSKO_MAZURSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, 2011,District.MALOPOLSKIE));

        assertEquals(2, carService.findByMake(MakeModelEnum.FORD_FOCUS).size());
    }


    @Test
    public void test8() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.BMW_X6, 2002, District.MAZOWIECKIE);
        Vehicle vehicle2 = new PassengerCar(MakeModelEnum.AUDI_A4, 2015,District.MALOPOLSKIE);
        Vehicle vehicle3 = new Motorcycle(MakeModelEnum.KAWASAKI_GTR, 2010, District.PODLASKIE);
        Vehicle vehicle4 = new Bus(MakeModelEnum.SAN, 2018,District.WARMINSKO_MAZURSKIE);
        Vehicle vehicle5 = new Truck(MakeModelEnum.JELCZ, 2001,District.MALOPOLSKIE);
        Vehicle vehicle6 = new PassengerCar(MakeModelEnum.FORD_FOCUS, 2013, District.MAZOWIECKIE);
        Vehicle vehicle7 = new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, 2017, District.PODLASKIE);
        Vehicle vehicle8 = new Truck(MakeModelEnum.SCANIA, 2010, District.PODLASKIE);
        Vehicle vehicle9 = new PassengerCar(MakeModelEnum.TOYOTA_RAV4, 2011,District.MALOPOLSKIE);

        carService.addCar(vehicle1);
        carService.addCar(vehicle2);
        carService.addCar(vehicle3);
        carService.addCar(vehicle4);
        carService.addCar(vehicle5);
        carService.addCar(vehicle6);
        carService.addCar(vehicle7);
        carService.addCar(vehicle8);
        carService.addCar(vehicle9);

        List<Vehicle> result = new ArrayList<>();

        result.add(vehicle5);
        result.add(vehicle1);
        result.add(vehicle3);
        result.add(vehicle8);
        result.add(vehicle9);
        result.add(vehicle6);
        result.add(vehicle2);
        result.add(vehicle7);
        result.add(vehicle4);

        assertEquals(result,carService.sortByProductionYear());
    }

    @Test
    public void test9() {

        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FIESTA, 2002, District.MAZOWIECKIE);
        Vehicle vehicle2 = new Bus(MakeModelEnum.SAN, 2015,District.MALOPOLSKIE);
        Vehicle vehicle3 = new Bus(MakeModelEnum.SOLARIS, 2010, District.PODLASKIE);
        Vehicle vehicle4 = new Truck(MakeModelEnum.JELCZ, 2018,District.WARMINSKO_MAZURSKIE);
        Vehicle vehicle5 = new PassengerCar(MakeModelEnum.AUDI_A4, 2001,District.MALOPOLSKIE);
        Vehicle vehicle6 = new PassengerCar(MakeModelEnum.FORD_FOCUS, 2013, District.MAZOWIECKIE);
        Vehicle vehicle7 = new PassengerCar(MakeModelEnum.BMW_X6, 2017, District.PODLASKIE);
        Vehicle vehicle8 = new Motorcycle(MakeModelEnum.SUZUKI_DR, 2010, District.PODLASKIE);
        Vehicle vehicle9 = new Motorcycle(MakeModelEnum.KAWASAKI_GTR, 2011,District.MALOPOLSKIE);

        carService.addCar(vehicle1);
        carService.addCar(vehicle2);
        carService.addCar(vehicle3);
        carService.addCar(vehicle4);
        carService.addCar(vehicle5);
        carService.addCar(vehicle6);
        carService.addCar(vehicle7);
        carService.addCar(vehicle8);
        carService.addCar(vehicle9);

        List<Vehicle> result = new ArrayList<>();

        result.add(vehicle5);
        result.add(vehicle1);
        result.add(vehicle3);
        result.add(vehicle8);
        result.add(vehicle9);
        result.add(vehicle6);
        result.add(vehicle2);
        result.add(vehicle7);
        result.add(vehicle4);

        assertEquals(result,carService.sortWithComparatorByProductionYear());
    }

}
