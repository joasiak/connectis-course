package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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
                .filter(s->s.getProduceDate().getYear()<year)
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
    public Set<Vehicle> findOlderThanGivenDate(LocalDate date) {
        return carMap.values().stream()
                .flatMap(x->x.stream())
                .filter(x->x.getProduceDate().isBefore(date))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Vehicle> findRegisteredBetween(LocalDate date1, LocalDate date2) {
        return carMap.values().stream()
                .flatMap(x->x.stream())
                .filter(x->x.getRegisterDate().isAfter(date1) && x.getRegisterDate().isBefore(date2))
          //      .filter(x->x.getRegisterDate().isAfter(date1))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Vehicle> findOlderThanXMonths(int months) {
        return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s-> ChronoUnit.MONTHS.between(s.getProduceDate(),LocalDate.now())>months)
                .collect(Collectors.toSet());
        /*
        carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->s.getProduceDate().isBefore(LocalDate.now().minusMonths(months)))
                .collect(Collectors.toSet());
         */
    }

    @Override
    public Set<Vehicle> findRegisteredBetweenDays(int days1, int days2) {
        return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->ChronoUnit.DAYS.between(s.getRegisterDate(),LocalDate.now())<=days1 && ChronoUnit.DAYS.between(s.getRegisterDate(),LocalDate.now())>=days2)
                .collect(Collectors.toSet());
        /*
        carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->s.getRegisterDate().isAfter(LocalDate.now().minusDays(days1)) && s.getRegisterDate().isBefore(LocalDate.now().minusDays(days2)))
                .collect(Collectors.toSet());
         */
    }

    @Override
    public Set<Vehicle> findRegisteredBetweenMonths(int months1, int months2) {
           return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->ChronoUnit.MONTHS.between(s.getRegisterDate(),LocalDate.now())<=months1 && ChronoUnit.DAYS.between(s.getRegisterDate(),LocalDate.now())>=months2)
                .collect(Collectors.toSet());

       /* return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->s.getRegisterDate().isAfter(LocalDate.now().minusMonths(months1)) && s.getRegisterDate().isBefore(LocalDate.now().minusMonths(months2)))
                .collect(Collectors.toSet());
       */
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