package pl.cschool.taskset3.microwave;

public class Oven implements Microwave {

    PowerStatus powerStatus = PowerStatus.OFF;
    int temperature;
    int time;
    OvenFunction ovenFunctionStatus;

    @Override
    public PowerStatus turnOn() {
        powerStatus = PowerStatus.ON;
        System.out.println("Kuchenka wlaczona");
        return powerStatus;
    }

    @Override
    public void powerTimeTypeSetter(int temperature, int time, OvenFunction function) {
        this.temperature=temperature;
        this.time=time;
        this.ovenFunctionStatus = function;
    }

    @Override
    public PowerStatus turnOff() {
        powerStatus = PowerStatus.OFF;
        System.out.println("Kuchenka wylaczona");
        return powerStatus;
    }

    public PowerStatus getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(PowerStatus powerStatus) {
        this.powerStatus = powerStatus;
    }

    public OvenFunction getOvenFunctionStatus() {
        return ovenFunctionStatus;
    }

    public void setOvenFunctionStatus(OvenFunction ovenFunctionStatus) {
        this.ovenFunctionStatus = ovenFunctionStatus;
    }
}

