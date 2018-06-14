package pl.cschool.taskset3.smarthome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class BudynekTest {

    Okno oKuchenne = new Okno("kuchenne");
    Okno oSypialniaMale = new Okno("sypialnia M");
    Okno oSypialniaDuze = new Okno("sypialnia D");

    Drzwi dBalkonowe = new Drzwi("balkonowe");
    Drzwi dKuchenne = new Drzwi("kuchenne");
    Drzwi dSypialnia = new Drzwi("sypialnia");

    HashSet<Drzwi> dKuchenneSet = new HashSet<>();
    HashSet<Okno> oKuchenneSet = new HashSet<>();

    HashSet<Drzwi> dSypialniaSet = new HashSet<>();
    HashSet<Okno> oSypialniaSet = new HashSet<>();

    Pomieszczenie kuchnia = new Pomieszczenie("kuchania", dKuchenneSet, oKuchenneSet);
    Pomieszczenie sypialnia = new Pomieszczenie("sypialnia",dSypialniaSet, oSypialniaSet);

    HashSet<Pomieszczenie> pomieszczenieParter = new HashSet<>();
    HashSet<Pomieszczenie> pomieszczeniePietro = new HashSet<>();

    Kondygnacja parter = new Kondygnacja("parter", pomieszczenieParter);
    Kondygnacja pierwszePietro = new Kondygnacja("pierwsze pietro", pomieszczeniePietro);

    ArrayList<Kondygnacja> kondygnacje = new ArrayList<>();

    Budynek chatkaPuchatka = new Budynek("chatka Puchatka", kondygnacje);

    @Before
    public void SetUp()
    {
        dKuchenneSet.add(dKuchenne);
        oKuchenneSet.add(oKuchenne);
        dSypialniaSet.add(dSypialnia);
        dSypialniaSet.add(dBalkonowe);
        oSypialniaSet.add(oSypialniaDuze);
        oSypialniaSet.add(oSypialniaMale);

        pomieszczenieParter.add(kuchnia);
        pomieszczeniePietro.add(sypialnia);

        kondygnacje.add(parter);
        kondygnacje.add(pierwszePietro);
    }

    @Test
    public void checkZamknieciWszystkichDrzwiOkien() {

        for (Iterator<Kondygnacja> itKondygnacja = chatkaPuchatka.getKondygnacje().iterator(); itKondygnacja.hasNext();) {
            Kondygnacja kondygnacja = itKondygnacja.next();
            for (Iterator<Pomieszczenie> itPomieszczenie = kondygnacja.getPomieszczenia().iterator();itPomieszczenie.hasNext();){
                Pomieszczenie pomieszczenie = itPomieszczenie.next();
                for (Iterator<Okno> itOkno = pomieszczenie.getOkna().iterator(); itOkno.hasNext(); ) {
                    Okno okno = itOkno.next();
                    okno.otworz();
                }
            }
        }

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
        dKuchenne.otworz();
        oSypialniaDuze.otworz();
        oSypialniaMale.otworz();
        alarm.uzbroj();
        alarm.sprawdzBudynek();
        assertEquals(StatusSyreny.WLACZONA, alarm.getSyrena());
        chatkaPuchatka.zamknijWszystkieDrzwiOkna();
        alarm.sprawdzBudynek();
        alarm.wylaczSyrene();
        assertEquals(StatusSyreny.WYLACZONA, alarm.getSyrena());
    }

}
