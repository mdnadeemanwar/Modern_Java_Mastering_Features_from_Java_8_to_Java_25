package org.learnjava.java17SealedClassInterface;

public sealed class Car extends Vehichle implements SmartMediaPlayer permits FlyingCar{

    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void connectPhone() {
        System.out.println("connectPhone");
    }
}
