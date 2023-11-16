package org.olukotun;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringVehicle {

    @Autowired
    private Speakers speakers = new SonarSpeaker();
    @Autowired private Tyres tyres = new MichelinTyres();
    public void makeVehicle(){
        speakers.makeSound();
        tyres.rotate();
    }

}
