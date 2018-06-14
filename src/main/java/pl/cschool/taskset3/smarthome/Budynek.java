package pl.cschool.taskset3.smarthome;

import java.util.ArrayList;

public class Budynek {

    private String nazwa;
    private ArrayList<Kondygnacja> kondygnacje;

    public Budynek(String nazwa, ArrayList<Kondygnacja> kondygnacje) {
        this.nazwa = nazwa;
        this.kondygnacje = kondygnacje;
    }

    public void zamknijWszystkieDrzwiOkna() {
        for (Kondygnacja kond : kondygnacje) {
            for (Pomieszczenie pom : kond.getPomieszczenia()) {
                for (Okno ok : pom.getOkna()) ok.zamknij();
                for (Drzwi drz: pom.getDrzwi()) drz.zamknij();
            }
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ArrayList<Kondygnacja> getKondygnacje() {
        return kondygnacje;
    }

    public void setKondygnacje(ArrayList<Kondygnacja> kondygnacje) {
        this.kondygnacje = kondygnacje;
    }

}
