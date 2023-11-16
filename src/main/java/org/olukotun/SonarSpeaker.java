package org.olukotun;

import org.springframework.stereotype.Component;

@Component
public class SonarSpeaker implements Speakers {
    public void makeSound(){
        System.out.println("Sonar speaker makes sound");
    }
}
