package org.olukotun;

public class TyreFactory {
    public static Tyres getTyre(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("TOYOTA")){
            return new ToyotaTyres();
        }
        if (type.equalsIgnoreCase("MICHELIN")){
            return new MichelinTyres();
        }
        return null;
    }
}
