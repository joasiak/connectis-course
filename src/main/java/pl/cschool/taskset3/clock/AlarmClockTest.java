package pl.cschool.taskset3.clock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlarmClockTest {
    @Test
    public void test1(){
        AlarmClock myClock = new AlarmClock();
        myClock.alarmStatus=AlarmClockStatus.OFF;
        assertEquals(AlarmClockStatus.ON, myClock.alarmOn());
        assertEquals(AlarmClockStatus.OFF, myClock.turnOffAlarm());
        System.out.println(myClock.getTime());
    }
}
