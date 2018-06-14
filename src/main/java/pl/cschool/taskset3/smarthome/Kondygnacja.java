package pl.cschool.taskset3.smarthome;

import java.util.HashSet;

public class Kondygnacja {

    private String nazwa;
    private HashSet<Pomieszczenie> pomieszczenia;

    public Kondygnacja(String nazwa,  HashSet<Pomieszczenie> pomieszczenia) {
        this.nazwa = nazwa;
        this.pomieszczenia = pomieszczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public HashSet<Pomieszczenie> getPomieszczenia() {
        return pomieszczenia;
    }

    public void setPomieszczenia(HashSet<Pomieszczenie> pomieszczenia) {
        this.pomieszczenia = pomieszczenia;
    }

}
