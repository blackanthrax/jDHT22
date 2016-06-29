package com.github.blackanthrax.terracontrol.jni;

public class SensorAdapter {

    static {
        System.loadLibrary("am2302jni");
    }

    private native Measurement getMeasurement() throws MeasurementException;

    public static void main(String[] args) {
         System.out.println("reading...");
	 System.out.println(new SensorAdapter()
            .getMeasurement()
            .toString());
    }
 
}
