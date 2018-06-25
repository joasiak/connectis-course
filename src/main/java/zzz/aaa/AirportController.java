package zzz.aaa;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AirportController implements DbService{

    List<Flight> fligthsRegister = new ArrayList<>();

    @Override
    public void add(Flight flight) {
        fligthsRegister.add(flight);
    }

    @Override
    public List<Flight> findByAirport(String airportCode, LocalDateTime startDate, LocalDateTime endDate) {
        return fligthsRegister.stream().filter(s->s.getFlightDto().getDepartureAirport().getCode().equals(airportCode))
                .filter(s->s.getFlightDto().getDepartureDate().isAfter(startDate) && s.getFlightDto().getDepartureDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    @Override
    public int airplaneStatsNoOfFlights(int planeNumber) {
        int result = 0;
        for (Flight flight : fligthsRegister) {
            if (flight.getAirplane().getPlaneNumber()==planeNumber)
                result++;
        }
        return result;
    }

    @Override
    public int airplaneStatsNoOfFlightsDuringLastNthDays(int planeNumber, int days) {
        List<Flight> list = fligthsRegister.stream()
                .filter(s->s.getAirplane().getPlaneNumber()==planeNumber)
                .filter(s->ChronoUnit.DAYS.between(s.getFlightDto().getDepartureDate(),LocalDateTime.now())<=days)
                .collect(Collectors.toList());
        return list.size();
    }

    @Override
    public List<Flight> findAllFlightBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return fligthsRegister.stream()
                .filter(s->s.getFlightDto().getDepartureDate().isAfter(startDate) && s.getFlightDto().getDepartureDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> sortByAirlines() {
        AirlinesComparator comparator = new AirlinesComparator();
        Collections.sort(fligthsRegister,comparator);
        return fligthsRegister;
    }

    @Override
    public List<Flight> sortByDepartureAirport() {
      //  DepartureAirportComparator comparator = new DepartureAirportComparator();
        Collections.sort(fligthsRegister, new DepartureAirportComparator());
        return fligthsRegister;
    }

    @Override
    public List<Flight> sortByDepartureTime() {
        Collections.sort(fligthsRegister);
        return fligthsRegister;
    }

    public List<Flight> getFligthsRegister() {
        return fligthsRegister;
    }
}
