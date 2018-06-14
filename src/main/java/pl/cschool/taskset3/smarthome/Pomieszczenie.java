package pl.cschool.taskset3.smarthome;

import java.util.HashSet;

public class Pomieszczenie {

    private String nazwa;
    private HashSet<Drzwi> drzwi;
    private HashSet<Okno> okna;

    public Pomieszczenie(String nazwa, HashSet<Drzwi> drzwi, HashSet<Okno> okna) {
        this.nazwa = nazwa;
        this.drzwi = drzwi;
        this.okna = okna;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public HashSet<Drzwi> getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(HashSet<Drzwi> drzwi) {
        this.drzwi = drzwi;
    }

    public HashSet<Okno> getOkna() {
        return okna;
    }

    public void setOkna(HashSet<Okno> okna) {
        this.okna = okna;
    }

    @Override
    public String toString() {
        return "Pomieszczenie{" +
                "nazwa='" + nazwa + '\'' +
                ", drzwi=" + drzwi +
                ", okna=" + okna +
                '}';
    }
}
