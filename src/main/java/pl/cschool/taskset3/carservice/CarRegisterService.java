package pl.cschool.taskset3.carservice;

import java.util.*;
import java.util.stream.Collectors;


public class CarRegisterService implements CarRegister {

    HashMap<District, HashSet<Car>> carMap = new HashMap<>();

    @Override
    public boolean create(Car car) {
        if (read(car.getId())!=null) return false;
        if (!carMap.containsKey(car.getDistrict())) {
            carMap.put(car.getDistrict(), new HashSet<>());
        }
        car.setDistrict(car.getDistrict());
        carMap.get(car.getDistrict()).add(car);
        return true;
    }

    @Override
    public Car read(int carId) {
        List<Car> list = carMap.values().stream()
                .flatMap(x -> x.stream())
                .filter(x -> x.getId() == carId)
                .collect(Collectors.toList());
        return  (list.size()!=0) ? list.get(0) : null;
    }

    @Override
    public void update(int carId, Car updatedCar) {
       delete(carId);
       create(updatedCar);
    }

    @Override
    public void delete(int carId) {
        for (District d : carMap.keySet()) {
            for (Car c : carMap.get(d)) {
                if (c.getId() == carId) {
                    carMap.get(d).remove(c);
                    return;
                }
            }
        }
    }

    @Override
    public HashSet<Car> findByDistrict(District d) {
        return carMap.get(d);
    }

    @Override
    public Set<Car> findAllOlderThan(int year) {
        return carMap.values().stream()
                .flatMap(s->s.stream())
                .filter(s->s.getProduceInYear()<year)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Car> findByMake(String m) {
        return carMap.values().stream()
                .flatMap(x->x.stream())
                .filter(x->x.getMake().equals(m))
                .collect(Collectors.toSet());

    }

    @Override
    public List<Car> sortByProductionYear() {
        List<Car> list =carMap.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        Collections.sort(list);
        return list;
    }

    @Override
    public List<Car> sortWithComparatorByProductionYear() {
        List<Car> list = carMap.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        CarComparator comparator = new CarComparator();
        Collections.sort(list, comparator);
        return list;
    }

}