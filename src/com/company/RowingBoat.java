package com.company;

public class RowingBoat extends Boat {

    public RowingBoat() {

        MessageCentre.DebugMessage("Creating a Rowing Boat");
    }


    @Override
    public String toString() {

        return String.format("rowing boat");
    }

    @Override
    public void Move(int speed, String direction) {

        MessageCentre.DebugMessage(String.format("I am rowing %s at %d metres per hour", direction, speed));
    }
}