package pl.cschool.taskset3.audio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAudioTest {
    @Test
    public void test() {
        MyAudio audio = new MyAudio();
        assertEquals(OnOffStatus.ON, audio.turnOn());
        audio.setIsRadioOnOff(true);
        assertEquals(true, audio.isRadioOn());
        assertEquals(OnOffStatus.OFF, audio.turnOff());
    }
}
