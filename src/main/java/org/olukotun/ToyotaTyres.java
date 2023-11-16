package org.olukotun;

import org.springframework.stereotype.Component;

@Component
public class ToyotaTyres implements Tyres{

    @Override
    public void rotate() {
        System.out.println("Toyota tyres rotate");
    }
}
