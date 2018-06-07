package pl.cschool.smarthome;

public class Kondygnacja {

    private String nazwa;
    private Pomieszczenie[] pomieszczenia;

    public Kondygnacja(String nazwa, Pomieszczenie[] pomieszczenia) {
        this.nazwa = nazwa;
        this.pomieszczenia = pomieszczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Pomieszczenie[] getPomieszczenia() {
        return pomieszczenia;
    }

    public void setPomieszczenia(Pomieszczenie[] pomieszczenia) {
        this.pomieszczenia = pomieszczenia;
    }
}
