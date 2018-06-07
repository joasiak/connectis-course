package pl.cschool.smarthome;

public class Alarm {

    private StatusAlarmu status = StatusAlarmu.WYLACZONY;
    private Budynek budynek;
    private StatusSyreny syrena = StatusSyreny.WYLACZONA;

    public Alarm(Budynek budynek) {
        this.budynek = budynek;
    }

    public void uzbroj(){
        status = StatusAlarmu.UZBROJONY;
    }

    public void wylaczSyrene() {

        boolean jakiekolwiekOtwarte = false;
        for (Kondygnacja kond : budynek.getKondygnacje()) {
            for (Pomieszczenie pom : kond.getPomieszczenia()) {
                for (Okno ok : pom.getOkna())  {
                    if (ok.getStatusOtwarcia()==StatusOtwarcia.OTWARTE) {
                      jakiekolwiekOtwarte = true;
                      break;
                    }
                }
                for (Drzwi drz : pom.getDrzwi()){
                    if (drz.getStatusOtwarcia()==StatusOtwarcia.OTWARTE) {
                       jakiekolwiekOtwarte = true;
                       break;
                    }
                }
            }
        }

        if (!jakiekolwiekOtwarte) {
            syrena = StatusSyreny.WYLACZONA;
        }
    }

    public StatusAlarmu getStatus() {
        return status;
    }

    public StatusSyreny getSyrena() {
        return syrena;
    }

    public void sprawdzBudynek() {

        if (status==StatusAlarmu.UZBROJONY) {
            for (Kondygnacja kond : budynek.getKondygnacje()) {
                for (Pomieszczenie pom : kond.getPomieszczenia()) {
                    for (Okno ok : pom.getOkna())  {
                        if (ok.getStatusOtwarcia()==StatusOtwarcia.OTWARTE) {
                            System.out.println("Lyju lyju lyju...");
                            System.out.println("Otwarte okno: " + ok.getNazwa() + " w pomieszczeniu " + pom.getNazwa() + " na kondygnacji " + kond.getNazwa());
                            syrena=StatusSyreny.WLACZONA;
                        }
                    }
                    for (Drzwi drz : pom.getDrzwi()){
                        if (drz.getStatusOtwarcia()==StatusOtwarcia.OTWARTE) {
                            System.out.println("Lyju lyju lyju...");
                            System.out.println("Otwarte drzwi: " + drz.getNazwa() + " w pomieszczeniu " + pom.getNazwa() + " na kondygnacji " + kond.getNazwa());
                            syrena=StatusSyreny.WLACZONA;
                        }
                    }
                }
            }
        }
    }
}



