package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Register {

    boolean addCar(Vehicle vehicle);
    Vehicle getCarById(int carId);
    void updateCar(int carId, Vehicle updatedVehicle);
    void deleteCarById(int carId);

    HashSet<Vehicle> findByDistrict(District d);
    Set<Vehicle> findOlderThan(int year);
    Set<Vehicle> findByMake(MakeModelEnum m);
    Set<Vehicle> findOlderThanGivenDate(LocalDate date);
    Set<Vehicle> findRegisteredBetween(LocalDate date1, LocalDate date2);
    Set<Vehicle> findOlderThanXMonths(int months);
    Set<Vehicle> findRegisteredBetweenDays(int days1, int days2);
    Set<Vehicle> findRegisteredBetweenMonths(int months1, int months2);

    List<Vehicle> sortByProductionYear();
    List<Vehicle> sortWithComparatorByProductionYear();




}
