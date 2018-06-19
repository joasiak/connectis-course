package pl.cschool.taskset3.microwave;

public interface Microwave {

    PowerStatus turnOn();
    PowerStatus turnOff();
    void powerTimeTypeSetter(int temperature, int time, OvenFunction function);

}
