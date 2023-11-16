package org.olukotun;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.makeVehicle1();
        vehicle.makeVehicle2();

        SpringVehicle springVehicle = new SpringVehicle();
        springVehicle.makeVehicle();
    }
}