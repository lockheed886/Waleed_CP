package com.waleed.jets;

public class Jet {
    private String model;
    private double speed; // in Mach
    private int range; // in km

    public Jet(String model, double speed, int range) {
        this.model = model;
        this.speed = speed;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }

    public void fly() {
        System.out.println(model + " is flying at " + speed + " Mach.");
    }

    public boolean isSupersonic() {
        return speed > 1.0;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", range=" + range +
                '}';
    }
}
