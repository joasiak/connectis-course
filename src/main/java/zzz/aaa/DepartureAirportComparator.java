package zzz.aaa;

import java.util.Comparator;

public class DepartureAirportComparator implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getFlightDto().getDepartureAirport().getCode().compareTo(o2.getFlightDto().getDepartureAirport().getCode());
    }
}
