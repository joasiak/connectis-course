package pl.cschool.taskset3.audio;

public class MyAudio implements Audio {
    OnOffStatus status = OnOffStatus.OFF;
    boolean isRadioOn = false;

    @Override
    public OnOffStatus turnOn() {
        System.out.println("Sprzet wlaczony");
        return OnOffStatus.ON;
    }

    @Override
    public OnOffStatus turnOff() {
        System.out.println("Sprzet wylaczony");
        return OnOffStatus.OFF;

    }

    @Override
    public void play() {
        System.out.println("Gra muzyka");
    }

    @Override
    public boolean isRadioOn() {
        if (isRadioOn) return true;
        return false;
    }

    public void setIsRadioOnOff(boolean radio) {
        this.isRadioOn = radio;
    }
}
