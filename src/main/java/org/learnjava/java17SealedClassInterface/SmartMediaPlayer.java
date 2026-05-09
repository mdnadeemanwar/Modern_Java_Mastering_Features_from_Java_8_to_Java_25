package org.learnjava.java17SealedClassInterface;

public sealed interface SmartMediaPlayer permits Car{

    void connectPhone();
}
