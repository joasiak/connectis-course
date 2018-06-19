package pl.cschool.taskset3.carservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface CarRegister {

    boolean create(Car car);
    Car read(int carId);
    void update(int carId, Car updatedCar);
    void delete(int carId);

    HashSet<Car> findByDistrict(District d);
    Set<Car> findAllOlderThan(int year);
    Set<Car> findByMake(String m);
    List<Car> sortByProductionYear();
    List<Car> sortWithComparatorByProductionYear();



}
