package org.learnjava.java17SealedClassInterface;

public  sealed abstract class Vehichle permits Bus, Car, Truck {

    public abstract String drive();

}
