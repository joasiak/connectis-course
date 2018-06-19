package pl.cschool.taskset3.carservice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarRegisterServiceTestSuite {

    CarRegisterService carService = new CarRegisterService();

    @Test
    public void test1() {
        Car car1 = new Car("Opel", 2002, District.MAZOWIECKIE);
        carService.create(car1);
        assertEquals(1, carService.carMap.size());
        assertEquals(car1, carService.read(1));
    }

    @Test
    public void test2() {
        Car car1 = new Car("Opel", 2002, District.MAZOWIECKIE);
        carService.create(car1);
        assertEquals(1, carService.carMap.size());
        carService.delete(car1.getId());
        assertEquals(0, carService.carMap.get(District.MAZOWIECKIE).size());
    }

    @Test
    public void test3() {

        Car car1 = new Car("Opel", 2002, District.MAZOWIECKIE);
        carService.create(car1);
        System.out.println(carService.carMap.values());
        car1 = new Car(car1.getId(),"Opel", 2012, District.MAZOWIECKIE);
        carService.update(car1.getId(), car1);
        System.out.println(carService.carMap.values());
        assertEquals(1, carService.carMap.size());
        assertEquals(car1, carService.read(car1.getId()));
    }

    @Test
    public void test5() {
        carService.create(new Car("Opel", 2002, District.MAZOWIECKIE));
        carService.create(new Car("Ford", 2013, District.MAZOWIECKIE));
        carService.create(new Car("Fiat", 2017, District.PODLASKIE));
        carService.create(new Car("Opel", 2010, District.PODLASKIE));
        carService.create(new Car("Fiat", 2009, District.SLASKIE));

        assertEquals(2, carService.findByDistrict(District.MAZOWIECKIE).size());
    }

    @Test
    public void test6() {
        carService.create(new Car("Opel", 2002, District.MAZOWIECKIE));
        carService.create(new Car("Ford", 2013, District.MAZOWIECKIE));
        carService.create(new Car("Fiat", 2017, District.PODLASKIE));
        carService.create(new Car("Opel", 2010, District.PODLASKIE));
        carService.create(new Car("Fiat", 2009, District.SLASKIE));
        carService.create(new Car("Toyota", 2018,District.WARMINSKO_MAZURSKIE));
        carService.create(new Car("BMW", 2015,District.MALOPOLSKIE));
        carService.create(new Car("Citroen", 2011,District.MALOPOLSKIE));

        assertEquals(4, carService.findAllOlderThan(2012).size());
    }

    @Test
    public void test7() {
        carService.create(new Car("Opel", 2002, District.MAZOWIECKIE));
        carService.create(new Car("BMW", 2015,District.MALOPOLSKIE));
        carService.create(new Car("Opel", 2010, District.PODLASKIE));
        carService.create(new Car("Toyota", 2018,District.WARMINSKO_MAZURSKIE));
        carService.create(new Car("Citroen", 2011,District.MALOPOLSKIE));

        assertEquals(2, carService.findByMake("Opel").size());
    }


    @Test
    public void test8() {
        Car car1 = new Car("Opel", 2002, District.MAZOWIECKIE);
        Car car2 = new Car("BMW", 2015,District.MALOPOLSKIE);
        Car car3 = new Car("Opel", 2010, District.PODLASKIE);
        Car car4 = new Car("Toyota", 2018,District.WARMINSKO_MAZURSKIE);
        Car car5 = new Car("Citroen", 2001,District.MALOPOLSKIE);
        Car car6 = new Car("Ford", 2013, District.MAZOWIECKIE);
        Car car7 = new Car("Fiat", 2017, District.PODLASKIE);
        Car car8 = new Car("Toyota", 2010, District.PODLASKIE);
        Car car9 = new Car("Citroen", 2011,District.MALOPOLSKIE);

        carService.create(car1);
        carService.create(car2);
        carService.create(car3);
        carService.create(car4);
        carService.create(car5);
        carService.create(car6);
        carService.create(car7);
        carService.create(car8);
        carService.create(car9);

        List<Car> result = new ArrayList<>();

        result.add(car5);
        result.add(car1);
        result.add(car8);
        result.add(car3);
        result.add(car9);
        result.add(car6);
        result.add(car2);
        result.add(car7);
        result.add(car4);

        assertEquals(result,carService.sortByProductionYear());
    }

    @Test
    public void test9() {

        Car car1 = new Car("Opel", 2002, District.MAZOWIECKIE);
        Car car2 = new Car("BMW", 2015,District.MALOPOLSKIE);
        Car car3 = new Car("Opel", 2010, District.PODLASKIE);
        Car car4 = new Car("Toyota", 2018,District.WARMINSKO_MAZURSKIE);
        Car car5 = new Car("Citroen", 2001,District.MALOPOLSKIE);
        Car car6 = new Car("Ford", 2013, District.MAZOWIECKIE);
        Car car7 = new Car("Fiat", 2017, District.PODLASKIE);
        Car car8 = new Car("Toyota", 2010, District.PODLASKIE);
        Car car9 = new Car("Citroen", 2011,District.MALOPOLSKIE);

        carService.create(car1);
        carService.create(car2);
        carService.create(car3);
        carService.create(car4);
        carService.create(car5);
        carService.create(car6);
        carService.create(car7);
        carService.create(car8);
        carService.create(car9);

        List<Car> result = new ArrayList<>();

        result.add(car5);
        result.add(car1);
        result.add(car8);
        result.add(car3);
        result.add(car9);
        result.add(car6);
        result.add(car2);
        result.add(car7);
        result.add(car4);

        assertEquals(result,carService.sortWithComparatorByProductionYear());
    }

}
