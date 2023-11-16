package org.olukotun;

public class Vehicle {
    public void makeVehicle1(){
        MichelinTyres michelinTyres = new MichelinTyres();
        michelinTyres.rotate();
        SonarSpeaker speaker = new SonarSpeaker();
        speaker.makeSound();
    }
    public void makeVehicle2(){
        Tyres michelinTyres = TyreFactory.getTyre("Michelin");
        michelinTyres.rotate();
        Speakers speakers = SpeakerFactory.getSpeaker("SONY");
        speakers.makeSound();

    }
}
