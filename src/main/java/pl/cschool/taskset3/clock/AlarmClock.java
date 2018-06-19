package pl.cschool.taskset3.clock;

import java.util.Date;

public class AlarmClock implements Clock {

    AlarmClockStatus alarmStatus = AlarmClockStatus.OFF;
    Date time = new Date();

    @Override
    public AlarmClockStatus alarmOn() {
        return alarmStatus=AlarmClockStatus.ON;
    }

    @Override
    public AlarmClockStatus turnOffAlarm() {
        return alarmStatus=AlarmClockStatus.OFF;
    }

    @Override
    public Date getTime() {
        return time;
    }

    public AlarmClockStatus getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(AlarmClockStatus alarmStatus) {
        this.alarmStatus = alarmStatus;
    }
}
