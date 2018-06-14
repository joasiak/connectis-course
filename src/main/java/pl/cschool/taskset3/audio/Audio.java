package pl.cschool.taskset3.audio;

public interface Audio {

    OnOffStatus turnOn();
    OnOffStatus turnOff();
    void play();
    boolean isRadioOn();
}
