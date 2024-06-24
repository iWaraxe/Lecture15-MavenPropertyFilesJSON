// File: Ex04JacksonObjectMapperURL.java
package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.util.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

/**
 * This class demonstrates reading JSON data from a URL using Jackson ObjectMapper.
 */
public class Ex04JacksonObjectMapperURL {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Car car = objectMapper.readValue(new URL("file:src/main/resources/json_car.json"), Car.class);
            System.out.println("Car read from URL: " + car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
