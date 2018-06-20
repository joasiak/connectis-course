package pl.cschool.taskset4.vehicleservice;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class VehicleRegisterServiceTestSuite {

    RegisterMenager carService = new RegisterMenager();

    @Test
    public void test1() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2002-02-03"),LocalDate.parse("2002-03-29"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        assertEquals(1, carService.carMap.size());
        int id = carService.carMap.values().stream().flatMap(s->s.stream()).collect(Collectors.toList()).get(0).getId();
        assertEquals(vehicle1, carService.getCarById(id));
    }

    @Test
    public void test2() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FIESTA, LocalDate.parse("2002-09-23"), LocalDate.parse("2003-02-23"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        assertEquals(1, carService.carMap.size());
        carService.deleteCarById(vehicle1.getId());
        assertEquals(0, carService.carMap.get(District.MAZOWIECKIE).size());
    }

    @Test
    public void test3() {

        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2002-12-03"), LocalDate.parse("2003-02-23"), District.MAZOWIECKIE);
        carService.addCar(vehicle1);
        System.out.println(carService.carMap.values());
        vehicle1 = new PassengerCar(vehicle1.getId(),MakeModelEnum.FORD_FOCUS, LocalDate.parse("2012-05-03"),LocalDate.parse("2003-02-23"), District.MAZOWIECKIE);
        carService.updateCar(vehicle1.getId(), vehicle1);
        System.out.println(carService.carMap.values());
        assertEquals(1, carService.carMap.size());
        assertEquals(vehicle1, carService.getCarById(vehicle1.getId()));
    }

    @Test
    public void findByDistrictTest() {
        carService.addCar(new Bus(MakeModelEnum.SOLARIS, LocalDate.parse("2002-03-03"), LocalDate.parse("2003-07-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4,LocalDate.parse("2013-10-03"), LocalDate.parse("2014-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2017-07-18"), LocalDate.parse("2017-12-23"), District.PODLASKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2010-07-19"), LocalDate.parse("2010-12-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6,LocalDate.parse("2009-10-25"), LocalDate.parse("2010-02-23"), District.SLASKIE));

        assertEquals(2, carService.findByDistrict(District.MAZOWIECKIE).size());
    }

    @Test
    public void findOlderThanTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-11-26"), LocalDate.parse("2003-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2013-06-15"), LocalDate.parse("2013-12-23"), District.MAZOWIECKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2017-08-12"), LocalDate.parse("2018-01-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2009-03-09"), LocalDate.parse("2009-08-23"), District.SLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2018-05-27"), LocalDate.parse("2018-09-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-12-15"), LocalDate.parse("2016-02-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2011-01-03"), LocalDate.parse("2001-06-23"), District.MALOPOLSKIE));

        assertEquals(4, carService.findOlderThan(2012).size());
    }

    @Test
    public void findByMakeTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2002-06-15"), LocalDate.parse("2003-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2015-02-17"), LocalDate.parse("2015-12-23"),District.MALOPOLSKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2010-05-10"), LocalDate.parse("2010-06-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2018-05-14"), LocalDate.parse("2018-05-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2011-01-03"), LocalDate.parse("2011-02-23"), District.MALOPOLSKIE));

        assertEquals(2, carService.findByMake(MakeModelEnum.FORD_FOCUS).size());
    }

    @Test
    public void findOlderThanGivenDateTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2002-08-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2016-02-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-04-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2002-01-23"), District.MALOPOLSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2017-11-18"), District.PODLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-09-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"), LocalDate.parse("2012-02-11"), District.MALOPOLSKIE));

        assertEquals(6, carService.findOlderThanGivenDate(LocalDate.parse("2015-01-01")).size());
    }

    @Test
    public void findRegisteredBetweenTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2002-08-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2016-02-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-04-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2002-01-23"), District.MALOPOLSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2017-11-18"), District.PODLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-09-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"), LocalDate.parse("2012-02-11"), District.MALOPOLSKIE));

        assertEquals(2, carService.findRegisteredBetween(LocalDate.parse("2015-02-01"),LocalDate.parse("2017-12-15")).size());

    }

    @Test
    public void findOlderThanXMonthsTest() {

        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2003-02-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2014-12-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-04-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2002-01-23"), District.MALOPOLSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2017-11-18"), District.PODLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-04-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"), LocalDate.parse("2012-02-11"), District.MALOPOLSKIE));

        assertEquals(7, carService.findOlderThanXMonths(12).size());

    }

    @Test
    public void findRegisteredBetweenDaysTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2002-08-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2016-02-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-05-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2002-01-23"), District.MALOPOLSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2017-11-18"), District.PODLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-09-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"), LocalDate.parse("2012-02-11"), District.MALOPOLSKIE));

        assertEquals(1, carService.findRegisteredBetweenDays(45, 20).size());
    }

    @Test
    public void findRegisteredBetweenMonthsTest() {
        carService.addCar(new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2002-08-23"), District.MAZOWIECKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2016-02-23"), District.MALOPOLSKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-23"), District.PODLASKIE));
        carService.addCar(new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-05-23"), District.WARMINSKO_MAZURSKIE));
        carService.addCar(new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2002-01-23"), District.MALOPOLSKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-02-23"), District.MAZOWIECKIE));
        carService.addCar(new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2017-11-18"), District.PODLASKIE));
        carService.addCar(new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-09-23"), District.PODLASKIE));
        carService.addCar(new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"), LocalDate.parse("2012-02-11"), District.MALOPOLSKIE));

        assertEquals(2, carService.findRegisteredBetweenMonths(36, 6).size());
    }


    @Test
    public void sortByProductionYearTest() {
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2002-04-10"), LocalDate.parse("2002-05-10"), District.MAZOWIECKIE);
        Vehicle vehicle2 = new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2015-10-29"), LocalDate.parse("2015-12-10"), District.MALOPOLSKIE);
        Vehicle vehicle3 = new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2010-12-03"), LocalDate.parse("2011-02-11"), District.PODLASKIE);
        Vehicle vehicle4 = new Bus(MakeModelEnum.SAN, LocalDate.parse("2018-03-25"), LocalDate.parse("2018-04-10"), District.WARMINSKO_MAZURSKIE);
        Vehicle vehicle5 = new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2001-09-18"), LocalDate.parse("2001-12-10"), District.MALOPOLSKIE);
        Vehicle vehicle6 = new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-01-07"), LocalDate.parse("2013-04-10"), District.MAZOWIECKIE);
        Vehicle vehicle7 = new Motorcycle(MakeModelEnum.YAMAHA_ZUMA, LocalDate.parse("2017-10-09"), LocalDate.parse("2018-02-10"), District.PODLASKIE);
        Vehicle vehicle8 = new Truck(MakeModelEnum.SCANIA, LocalDate.parse("2010-03-23"), LocalDate.parse("2010-04-10"), District.PODLASKIE);
        Vehicle vehicle9 = new PassengerCar(MakeModelEnum.TOYOTA_RAV4, LocalDate.parse("2011-11-03"),LocalDate.parse("2012-01-25"), District.MALOPOLSKIE);

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
    public void sortWithComparatorByProductionYearTest() {

        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FIESTA, LocalDate.parse("2002-11-23"), LocalDate.parse("2003-01-10"), District.MAZOWIECKIE);
        Vehicle vehicle2 = new Bus(MakeModelEnum.SAN, LocalDate.parse("2015-07-13"),LocalDate.parse("2015-09-10"), District.MALOPOLSKIE);
        Vehicle vehicle3 = new Bus(MakeModelEnum.SOLARIS, LocalDate.parse("2010-09-23"), LocalDate.parse("2010-10-10"), District.PODLASKIE);
        Vehicle vehicle4 = new Truck(MakeModelEnum.JELCZ, LocalDate.parse("2018-01-05"), LocalDate.parse("2018-03-18"), District.WARMINSKO_MAZURSKIE);
        Vehicle vehicle5 = new PassengerCar(MakeModelEnum.AUDI_A4, LocalDate.parse("2001-02-17"), LocalDate.parse("2001-04-10"), District.MALOPOLSKIE);
        Vehicle vehicle6 = new PassengerCar(MakeModelEnum.FORD_FOCUS, LocalDate.parse("2013-07-16"), LocalDate.parse("2013-09-10"), District.MAZOWIECKIE);
        Vehicle vehicle7 = new PassengerCar(MakeModelEnum.BMW_X6, LocalDate.parse("2017-09-12"), LocalDate.parse("2017-12-10"), District.PODLASKIE);
        Vehicle vehicle8 = new Motorcycle(MakeModelEnum.SUZUKI_DR, LocalDate.parse("2010-05-09"), LocalDate.parse("2010-06-10"), District.PODLASKIE);
        Vehicle vehicle9 = new Motorcycle(MakeModelEnum.KAWASAKI_GTR, LocalDate.parse("2011-01-03"), LocalDate.parse("2011-04-10"), District.MALOPOLSKIE);

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

    @Test
    public void requiredLicenseCategoryTest(){
        Vehicle vehicle1 = new PassengerCar(MakeModelEnum.FORD_FIESTA, LocalDate.parse("2002-11-23"), LocalDate.parse("2003-01-10"), District.MAZOWIECKIE);
        Vehicle vehicle2 = new Bus(MakeModelEnum.SAN, LocalDate.parse("2015-07-13"),LocalDate.parse("2015-09-10"), District.MALOPOLSKIE);

        assertEquals(DrivingLicense.Cat_B, vehicle1.requiredLicenseCategory());
        assertEquals(DrivingLicense.Cat_D, vehicle2.requiredLicenseCategory());

    }
}
