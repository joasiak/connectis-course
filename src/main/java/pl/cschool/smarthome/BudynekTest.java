package pl.cschool.smarthome;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BudynekTest {
    Okno oBalkonowe = new Okno("balkonowe");
    Okno oKuchanne = new Okno("kuchenne");
    Okno oSypialniaMale = new Okno("sypialnia M");
    Okno oSypialniaDuze = new Okno("sypialnia D");

    Drzwi dGarazowe = new Drzwi("garazowe");
    Drzwi dWejsciowe = new Drzwi("wejsciowe");
    Drzwi dKuchenne = new Drzwi("kuchenne");
    Drzwi dSypialnia = new Drzwi("sypialnia");

    Pomieszczenie kuchnia = new Pomieszczenie("kuchania",new Drzwi[]{dKuchenne},new Okno[]{oKuchanne});
    Pomieszczenie sypialnia = new Pomieszczenie("sypialnia",new Drzwi[]{dSypialnia},new Okno[]{oSypialniaDuze,oSypialniaMale});

    Kondygnacja pierwszePietro = new Kondygnacja("pierwsze pietro", new Pomieszczenie[]{sypialnia});
    Kondygnacja parter = new Kondygnacja("parter", new Pomieszczenie[]{kuchnia});

    Budynek chatkaPuchatka = new Budynek("chatka Puchatka", new Kondygnacja[]{parter, pierwszePietro});

    @Test
    public void checkZamknieciWszystkichDrzwiOkien() {

        chatkaPuchatka.getKondygnacje()[0].getPomieszczenia()[0].getOkna()[0].otworz();
        chatkaPuchatka.zamknijWszystkieDrzwiOkna();

        for (Kondygnacja kond : chatkaPuchatka.getKondygnacje()) {
            for (Pomieszczenie pom : kond.getPomieszczenia()) {
                for (Okno ok : pom.getOkna())
                    Assert.assertEquals(StatusOtwarcia.ZAMKNIETE, ok.getStatusOtwarcia());
                for (Drzwi drz: pom.getDrzwi())
                    assertEquals(StatusOtwarcia.ZAMKNIETE,drz.getStatusOtwarcia());
            }
        }

    }



    @Test
    public void sprawdzBudynekTest() {
        Alarm alarm = new Alarm(chatkaPuchatka);
        chatkaPuchatka.getKondygnacje()[0].getPomieszczenia()[0].getOkna()[0].otworz();
        alarm.uzbroj();
        alarm.sprawdzBudynek();
        assertEquals(StatusSyreny.WLACZONA, alarm.getSyrena());
        chatkaPuchatka.zamknijWszystkieDrzwiOkna();
        alarm.sprawdzBudynek();
        alarm.wylaczSyrene();
        assertEquals(StatusSyreny.WYLACZONA, alarm.getSyrena());

    }



}
