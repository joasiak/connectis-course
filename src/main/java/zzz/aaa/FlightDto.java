package zzz.aaa;

import java.time.LocalDateTime;

public class FlightDto {
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;

    public FlightDto(Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDate) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate;
    }
}
