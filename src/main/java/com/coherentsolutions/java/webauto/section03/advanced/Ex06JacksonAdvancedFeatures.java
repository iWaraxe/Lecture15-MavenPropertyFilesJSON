// File: Ex06JacksonAdvancedFeatures.java
package com.coherentsolutions.java.webauto.section03.advanced;

import com.coherentsolutions.java.webauto.section03.util.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates advanced features of Jackson ObjectMapper such as serialization settings.
 */
public class Ex06JacksonAdvancedFeatures {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Car car = new Car("blue", "toyota");
        try {
            objectMapper.writeValue(new File("target/car_advanced.json"), car);
            Car readCar = objectMapper.readValue(new File("target/car_advanced.json"), Car.class);
            System.out.println("Advanced Car: " + readCar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
