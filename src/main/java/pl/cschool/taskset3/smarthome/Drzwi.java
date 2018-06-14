package pl.cschool.taskset3.smarthome;

public class Drzwi {

    private String nazwa;
    private StatusOtwarcia statusOtwarcia = StatusOtwarcia.OTWARTE;

    public Drzwi(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {

        return nazwa;
    }


    public void setStatusOtwarcia(StatusOtwarcia statusOtwarcia) {
        this.statusOtwarcia=statusOtwarcia;
    }

    public StatusOtwarcia getStatusOtwarcia() {
        return statusOtwarcia;
    }

    public void zamknij() {
        statusOtwarcia=StatusOtwarcia.ZAMKNIETE;
    }

    public void otworz() {
        statusOtwarcia=StatusOtwarcia.OTWARTE;

    }

    @Override
    public String toString() {
        return "Drzwi{" +
                "nazwa='" + nazwa + '\'' +
                ", statusOtwarcia=" + statusOtwarcia +
                '}';
    }
}
