package com.shaneydev.tieng;

/**
 * Created by Shane on 05/08/2017.
 */

public class VowelSound {

    public String name;
    public int sound;

    public int straightWaveURI;
    public int up_toneURI;
    public int down_tơneURI;
    public int hoi_toneURI;
    public int wave_toneURI;
    public int dot_toneURI;

    public void Vowel(String commonName, int soundfileURI) {

        this.name = commonName;
        this.sound = soundfileURI;

    }

}
