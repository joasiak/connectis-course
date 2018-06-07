package pl.cschool.smarthome;

public class Budynek {

    private String nazwa;
    private Kondygnacja[] kondygnacje;

    public Budynek(String nazwa, Kondygnacja[] kondygnacje) {
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

    public Kondygnacja[] getKondygnacje() {
        return kondygnacje;
    }

    public void setKondygnacje(Kondygnacja[] kondygnacje) {
        this.kondygnacje = kondygnacje;
    }



}
