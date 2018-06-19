package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class RegisterMenager implements Register {

    HashMap<District, HashSet<Vehicle>> carMap = new HashMap<>();

    @Override
    public boolean addCar(Vehicle vehicle) {
        if (getCarById(vehicle.getId())!=null) return false;
        if (!carMap.containsKey(vehicle.getDistrict())) {
            carMap.put(vehicle.getDistrict(), new HashSet<>());
        }
        vehicle.setDistrict(vehicle.getDistrict());
        carMap.get(vehicle.getDistrict()).add(vehicle);
        return true;
    }

    @Override
    public Vehicle getCarById(int carId) {
        List<Vehicle> list = carMap.values().stream()
                .flatMap(x -> x.stream())
                .filter(x -> x.getId() == carId)
                .collect(Collectors.toList());
        return  (list.size()!=0) ? list.get(0) : null;
    }

    @Override
    public void updateCar(int carId, Vehicle updatedVehicle) {
       deleteCarById(carId);
       addCar(updatedVehicle);
    }

    @Override
    public void deleteCarById(int carId) {
        for (District d : carMap.keySet()) {
            for (Vehicle c : carMap.get(d)) {
                if (c.getId() == carId) {
                    carMap.get(d).remove(c);
                    return;
                }
            }
        }
    }

    @Override
    public HashSet<Vehicle> findByDistrict(District d) {
        return carMap.get(d);
    }

    @Override
    public Set<Vehicle> findOlderThan(int year) {
        return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->s.getProducedIn().getYear()<year)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Vehicle> findByMake(MakeModelEnum m) {
        return carMap.values().stream()
                .flatMap(x->x.stream())
                .filter(x->x.getModel().equals(m))
                .collect(Collectors.toSet());

    }

    @Override
    public Set<Vehicle> findOlderThan(LocalDate date) {
        return carMap.values().stream()
                .flatMap(x->x.stream())
                .filter(x->x.getProducedIn().isBefore(date))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Vehicle> findRegisteredBetween(LocalDate date1, LocalDate date2) {
        return null;
    }

    @Override
    public Set<Vehicle> findRegisteredByXMonths(int months) {
        return null;
    }

    @Override
    public Set<Vehicle> findRegisteredBetweenDays(int days1, int days2) {
        return null;
    }

    @Override
    public List<Vehicle> sortByProductionYear() {
        List<Vehicle> list =carMap.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        Collections.sort(list);
        return list;
    }

    @Override
    public List<Vehicle> sortWithComparatorByProductionYear() {
        List<Vehicle> list = carMap.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        CarComparator comparator = new CarComparator();
        Collections.sort(list, comparator);
        return list;
    }




}