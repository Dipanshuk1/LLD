package org.example.solid.dip.easy;

public class DIPDemo {

    public static void main(String[] args) {

        Switch bulbSwitch = new Switch(new Bulb());
        bulbSwitch.operate();

        Switch fanSwitch = new Switch(new Fan());
        fanSwitch.operate();
    }
}
