package org.olukotun;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    public void rotate(){
        System.out.println("Michelin Tyre rotates");
    }
}
