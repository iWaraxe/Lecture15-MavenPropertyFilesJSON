// File: Ex03JacksonObjectMapperFile.java
package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.util.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates reading JSON data from a file using Jackson ObjectMapper.
 */
public class Ex03JacksonObjectMapperFile {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Car car = objectMapper.readValue(new File("src/main/resources/json_car.json"), Car.class);
            System.out.println("Car read from file: " + car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
