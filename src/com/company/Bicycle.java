
package com.company;

public class Bicycle extends Cycle {

    public Bicycle() {
        MessageCentre.DebugMessage("Creating a Bicycle");

        setManufacturer("");
        setModelName("");
    }

    @Override
    public String toString() {

        return "I am a bicycle";
    }

    @Override
    public void Move(int speed, String direction) {

    }
}