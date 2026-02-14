package org.example.solid.dip.easy;



public class Bulb implements Switchable
{

    @Override
    public void turnOn() {
        System.out.println("Bulb is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is OFF");
    }
}



// bulb (low level module)  switch (high level)