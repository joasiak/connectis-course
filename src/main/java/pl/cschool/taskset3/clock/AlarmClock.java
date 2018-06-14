package pl.cschool.taskset3.clock;

import java.util.Date;

public class AlarmClock implements Clock {

    AlarmStatus alarmStatus = AlarmStatus.OFF;
    Date time = new Date();

    @Override
    public AlarmStatus setAlarm() {
        System.out.println("Alarm wlaczony");
        return alarmStatus=AlarmStatus.ON;
    }

    @Override
    public AlarmStatus turnOffAlarm() {
        System.out.println("Alarm wylaczony");
        return alarmStatus=AlarmStatus.OFF;
    }

    @Override
    public Date getTime() {
        return time;
    }


}
