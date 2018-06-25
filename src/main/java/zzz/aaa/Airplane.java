package zzz.aaa;

public class Airplane {

    private String name;
    private String airlines;
    private int planeNumber;

    public Airplane(String name, String airlines, int planeNumber) {
        this.name = name;
        this.airlines = airlines;
        this.planeNumber = planeNumber;
    }

    public int getPlaneNumber() {
        return planeNumber;
    }

    public String getAirlines() {
        return airlines;
    }

    @Override
    public String toString() {
        return ", airplane no{"+ airlines + " " + planeNumber +
                '}';
    }
}
