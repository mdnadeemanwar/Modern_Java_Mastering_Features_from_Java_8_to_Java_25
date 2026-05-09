package org.learnjava.java17SealedClassInterface;

public sealed class Car extends Vehichle permits FlyingCar{

    @Override
    public String drive() {
        return "CAR";
    }
}
