package pl.cschool.taskset3.microwave;

public class Oven implements Microwave {

    PowerStatus powerStatus = PowerStatus.OFF;
    int temperature;
    int minutes;

    @Override
    public PowerStatus turnOn() {
        powerStatus = PowerStatus.ON;
        System.out.println("Kuchenka wlaczona");
        return powerStatus;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Ustawiona temperatura na: " + temperature);
    }

    @Override
    public void setTimer(int minutes) {
        this.minutes=minutes;
    }

    @Override
    public PowerStatus turnOff() {
        powerStatus = PowerStatus.OFF;
        System.out.println("Kuchenka wylaczona");
        return powerStatus;
    }
}

