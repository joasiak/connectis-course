package pl.cschool.taskset3.audio;

public class AudioStereo implements Audio {
    OnOffStatus status = OnOffStatus.OFF;
    boolean isRadioOn = false;

    @Override
    public void turnOn() {
        System.out.println("Sprzet wlaczony");
        status=OnOffStatus.ON;
    }

    @Override
    public void turnOff() {
        System.out.println("Sprzet wylaczony");
        status = OnOffStatus.OFF;
    }


    public void setIsRadioOnOff(boolean radio) {
        this.isRadioOn = radio;
    }

    public OnOffStatus getStatus() {
        return status;
    }

    public void setStatus(OnOffStatus status) {
        this.status = status;
    }
}
