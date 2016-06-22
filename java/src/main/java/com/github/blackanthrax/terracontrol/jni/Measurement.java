package com.github.blackanthrax.terracontrol.jni;

public class Measurement {

    private double humidity;
    private double temperature;
    
    public Measurement(double humidity, double temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
