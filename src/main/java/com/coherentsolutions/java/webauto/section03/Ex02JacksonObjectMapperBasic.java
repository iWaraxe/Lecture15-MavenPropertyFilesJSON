// File: Ex02JacksonObjectMapperBasic.java
package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.util.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates using Jackson ObjectMapper to write and read JSON data.
 */
public class Ex02JacksonObjectMapperBasic {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");

        // Writing to a file
        try {
            objectMapper.writeValue(new File("target/car.json"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a JSON string
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        try {
            Car carFromString = objectMapper.readValue(json, Car.class);
            System.out.println("Car read from string: " + carFromString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}