package pl.cschool.taskset3.audio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAudioTest {
    @Test
    public void test() {
        AudioStereo audio = new AudioStereo();
        audio.turnOn();
        assertEquals(OnOffStatus.ON,audio.getStatus());
        audio.turnOff();
        assertEquals(OnOffStatus.OFF, audio.getStatus());
    }
}
