package pl.cschool.taskset4.smarthome;

import pl.cschool.taskset3.audio.Audio;
import pl.cschool.taskset3.audio.AudioStereo;

import java.util.ArrayList;
import java.util.List;

public class LivingRoom extends AbstractRoom {

    AudioStereo myAudio = new AudioStereo();

    public LivingRoom(String name, List<Furniture> furniture) {
        super(name);
        prepareRoom(furniture, FurnitureStatus.ALL_NEW);
    }

}



