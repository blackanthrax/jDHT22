package com.github.blackanthrax.jdht22;

public class Sensor {

    static {
        System.loadLibrary("am2302jni");
    }

    public native Measurement getMeasurement() throws MeasurementException;

    public static void main(String[] args) {
         System.out.println("reading...");
	 System.out.println(new SensorAdapter()
            .getMeasurement()
            .toString());
    }
 
}
