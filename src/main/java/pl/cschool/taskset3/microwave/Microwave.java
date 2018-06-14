package pl.cschool.taskset3.microwave;

public interface Microwave {

    PowerStatus turnOn();
    PowerStatus turnOff();
    void setTimer(int minutes);
    void setTemperature(int temperature);

}
