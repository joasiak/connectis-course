package zzz.aaa;

import java.time.LocalDateTime;
import java.util.List;

public interface DbService {

    void add(Flight flight);
    List<Flight> findByAirport(String airportCode, LocalDateTime startDate, LocalDateTime endDate);
    int airplaneStatsNoOfFlights(int planeNumber);
    int airplaneStatsNoOfFlightsDuringLastNthDays(int planeNumber, int days);
    List<Flight> findAllFlightBetween( LocalDateTime startDate, LocalDateTime endDate);

    List<Flight> sortByAirlines();
    List<Flight> sortByDepartureAirport();
    List<Flight> sortByDepartureTime();


}
