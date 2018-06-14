package pl.cschool.taskset3.clock;

import java.util.Date;

public interface Clock {

    AlarmStatus setAlarm();
    AlarmStatus turnOffAlarm();
    Date getTime();

}
