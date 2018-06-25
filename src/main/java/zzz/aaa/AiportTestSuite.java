package zzz.aaa;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class AiportTestSuite {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    //Aiports
    Airport WAW = new Airport("F.Chopina", "WAW");
    Airport FRA = new Airport("Frankfurt Airport", "FRA");
    Airport JFK = new Airport("John F.Kennedy", "JFK");
    Airport CDG = new Airport("Charles de Gaulle", "CDG");
    Airport KRK = new Airport("Krakow-Balice Airport", "KRK");

    //Airplanes
    Airplane plane1 = new Airplane("Boeing787", "PLL LOT", 3502);
    Airplane plane2 = new Airplane("AirbusA319", "Lufthansa", 6102);
    Airplane plane3 = new Airplane("Boeing767", "PLL LOT", 3801);
    Airplane plane4 = new Airplane("AirbusA380", "KLM", 5804);

    //flightsDto
    FlightDto flightDto1 = new FlightDto(WAW, KRK, LocalDateTime.parse("2018-04-08 12:30", formatter));
    FlightDto flightDto2 = new FlightDto(JFK, WAW, LocalDateTime.parse("2017-12-22 12:00", formatter));
    FlightDto flightDto3 = new FlightDto(CDG, KRK, LocalDateTime.parse("2018-05-05 15:30", formatter));
    FlightDto flightDto4 = new FlightDto(WAW, FRA, LocalDateTime.parse("2018-02-24 16:40", formatter));
    FlightDto flightDto5 = new FlightDto(WAW, CDG, LocalDateTime.parse("2017-11-18 12:20", formatter));
    FlightDto flightDto6 = new FlightDto(WAW, KRK, LocalDateTime.parse("2018-03-05 09:10", formatter));
    FlightDto flightDto7 = new FlightDto(JFK, KRK, LocalDateTime.parse("2018-04-08 10:30", formatter));
    FlightDto flightDto8 = new FlightDto(CDG, FRA, LocalDateTime.parse("2018-04-30 11:45", formatter));
    FlightDto flightDto9 = new FlightDto(KRK, FRA, LocalDateTime.parse("2018-03-29 19:00", formatter));
    FlightDto flightDto10 = new FlightDto(FRA, JFK, LocalDateTime.parse("2018-01-19 06:30", formatter));

    //flights
    Flight flight1 = new Flight("LOT3845", plane1, flightDto1);
    Flight flight2 = new Flight("LOT2575", plane3, flightDto2);
    Flight flight3 = new Flight("KLM7845", plane4, flightDto3);
    Flight flight4 = new Flight("LOT2848", plane1, flightDto4);
    Flight flight5 = new Flight("LOT4238", plane1, flightDto5);
    Flight flight6 = new Flight("LOT8842", plane3, flightDto6);
    Flight flight7 = new Flight("LH3845", plane2, flightDto7);
    Flight flight8 = new Flight("LH6745", plane2, flightDto8);
    Flight flight9 = new Flight("LOT9845", plane1, flightDto9);
    Flight flight10 = new Flight("LH2435", plane2, flightDto10);


    AirportController airportController = new AirportController();


    @Before
    public void prepareDb() {
        airportController.add(flight1);
        airportController.add(flight2);
        airportController.add(flight3);
        airportController.add(flight4);
        airportController.add(flight5);
        airportController.add(flight6);
        airportController.add(flight7);
        airportController.add(flight8);
        airportController.add(flight9);
        airportController.add(flight10);
    }

    @Test
    public void addTest() {
        assertEquals(10, airportController.getFligthsRegister().size());
    }

    @Test
    public void findByAirportTest() {
        assertEquals(3, airportController.findByAirport("WAW",  LocalDateTime.parse("2018-01-08 12:30", formatter),  LocalDateTime.parse("2018-04-20 12:30", formatter)).size() );
    }


    @Test
    public void airplaneStatsNoOfFlightsTest() {
        assertEquals(4, airportController.airplaneStatsNoOfFlights(3502));
    }


    @Test
    public void findAllFlightBetweenTest() {
       assertEquals(6,airportController.findAllFlightBetween(LocalDateTime.parse("2018-01-08 12:30", formatter),  LocalDateTime.parse("2018-04-20 12:30", formatter)).size());
    }


    @Test
    public void airplaneStatsNoOfFlightsDuringLastNthMonthsTest() {
        assertEquals(2, airportController.airplaneStatsNoOfFlightsDuringLastNthDays(3502, 90));
    }

    @Test
    public void sortByAirlines() {
        airportController.sortByAirlines().stream().forEach(System.out::println);
    }

    @Test
    public void sortByDepartureAirport() {
        airportController.sortByDepartureAirport().stream().forEach(System.out::println);
    }

    @Test
    public void sortByDepartureTime() {
        airportController.sortByDepartureTime().stream().forEach(System.out::println);
    }



}





