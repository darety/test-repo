package org.olukotun;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers{
    @Override
    public void makeSound() {
        System.out.println("BoseSpeaker making sound");
    }
}
