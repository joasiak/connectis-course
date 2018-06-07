package pl.cschool.smarthome;

public class Okno {

    private String nazwa;
    private StatusOtwarcia statusOtwarcia = StatusOtwarcia.ZAMKNIETE;

    public Okno(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNazwa(String nazwa) {
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


}
