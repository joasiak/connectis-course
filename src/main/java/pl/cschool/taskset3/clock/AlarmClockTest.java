package pl.cschool.taskset3.clock;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class AlarmClockTest {
    @Test
    public void test1(){
        AlarmClock myClock = new AlarmClock();
        myClock.alarmStatus=AlarmStatus.OFF;
        assertEquals(AlarmStatus.ON, myClock.setAlarm());
        assertEquals(AlarmStatus.OFF, myClock.turnOffAlarm());
        System.out.println(myClock.getTime());
    }
}
