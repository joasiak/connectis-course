package pl.cschool.taskset3.clock;

import java.util.Date;

public interface Clock {

    AlarmClockStatus alarmOn();
    AlarmClockStatus turnOffAlarm();
    Date getTime();

}
