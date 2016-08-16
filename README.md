# jDHT22
jDHT22 is a Java library for the DHT22/AM2302 temperature and humidity sensor. It is based on the code of the [loldht_22 c++ code](https://github.com/technion/lol_dht22). 
## Prerequisites
You should have
* a RaspberryPi
* WiringPi installed
* Java 1.8+ installed
* Apache Maven installed
## Installation instructions
* clone this repository
* run ```mvn clean package ```
* run ```cd java && mvn install```
* run ```cd .. && cd native/linux/target```
* copy the ```libam2302jni.so``` to you projects directory (preferably a directory called lib)
* add the following lines to your pom.xml
```xml
<dependency>
  <groupId>com.github.blackanthrax</groupId>
  <artifactId>jDHT22</artifactId>
  <version>1.0</version>
</dependency>
```
# Usage
jDHT22 uses a builder pattern to create new sensor objects. Each time you do so, you should specify a GPIO pin to use. The default pin is 7!
```java
Sensor sensor = Sensor.newSensor().withPin(3).withName("some name to identify the pin").build();
try {
    Measurement measurement = sensor.getMeasurement();
} catch(MeasurementException e) {
  // do something
}
```
Now start your app with ```java -jar yourapp.jar -Djava.library.path=<path-to-the-am2302jni.so>```. 

# Recommendations
I highly recommend following [this tutorial](http://wiringpi.com/wiringpi-update-to-2-29/) to get rid of the need to call your app as root. 
