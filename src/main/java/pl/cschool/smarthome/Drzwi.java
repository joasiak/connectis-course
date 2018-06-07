package pl.cschool.smarthome;

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
}
