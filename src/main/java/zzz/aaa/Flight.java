package zzz.aaa;

public class Flight implements Comparable<Flight>  {
    private String flightNumber;
    private Airplane airplane;
    private FlightDto flightDto;
    private FlightStatus status;

    public Flight(String flightNumber, Airplane airplane, FlightDto flightDto) {
        this.flightNumber = flightNumber;
        this.airplane = airplane;
        this.flightDto = flightDto;
    }

    public FlightDto getFlightDto() {
        return flightDto;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    @Override
    public String toString() {
        return "Flight{" +
                 flightNumber + " " +
                 flightDto + " " + airplane +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Flight o) {
        return flightDto.getDepartureDate().compareTo(o.getFlightDto().getDepartureDate());
    }
}
