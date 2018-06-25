package zzz.aaa;

import java.util.Comparator;

public class AirlinesComparator implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getAirplane().getAirlines().compareTo(o2.getAirplane().getAirlines());
    }
}
