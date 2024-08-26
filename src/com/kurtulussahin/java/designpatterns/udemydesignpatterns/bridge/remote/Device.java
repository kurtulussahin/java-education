package com.kurtulussahin.java.designpatterns.udemydesignpatterns.bridge.remote;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
