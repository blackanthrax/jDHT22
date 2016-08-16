package com.github.blackanthrax.jdht22;

import com.github.blackanthrax.jdht22.Measurement;
import com.github.blackanthrax.jdht22.MeasurementException;

public class Sensor {

    static {
        System.loadLibrary("am2302jni");
    }
    
    private int pin = 0;
    private String name;
    
    private Sensor(int pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public native Measurement getMeasurement() throws MeasurementException;
    
    public static Builder newSensor(){
        return new Builder();
    }
    
    public static class Builder {
        
        private int pin;
        private String name;
        
        private Builder(){}
        
        public Builder withPin(int pin){
            this.pin = pin;
            return this;
        }
        
        public Builder withName(String name){
            this.name = name;
            return this;
        }
        
        public Sensor build(){
            return new Sensor(pin, name);
        }
    }
}
