package pl.cschool.smarthome;

public class Pomieszczenie {

    private String nazwa;
    private Drzwi[] drzwi;
    private Okno[] okna;

    public Pomieszczenie(String nazwa, Drzwi[] drzwi, Okno[] okna) {
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

    public Drzwi[] getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(Drzwi[] drzwi) {
        this.drzwi = drzwi;
    }

    public Okno[] getOkna() {
        return okna;
    }

    public void setOkna(Okno[] okna) {
        this.okna = okna;
    }
}
