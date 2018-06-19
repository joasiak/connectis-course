package pl.cschool.taskset4.vehicleservice;

import java.util.Comparator;

public class CarComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getProducedIn().getYear() - o2.getProducedIn().getYear()!=0)
            return o1.getProducedIn().getYear() - o2.getProducedIn().getYear();
        return o1.getId() - o2.getId();
    }
}
