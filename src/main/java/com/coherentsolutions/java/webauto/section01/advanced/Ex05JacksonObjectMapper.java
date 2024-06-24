// File: Ex05JacksonObjectMapper.java
package com.coherentsolutions.java.webauto.section01.advanced;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates using Jackson ObjectMapper to write and read JSON data.
 */
public class Ex05JacksonObjectMapper {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");

        // Writing to a file
        try {
            objectMapper.writeValue(new File("target/car.json"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try {
            Car readCar = objectMapper.readValue(new File("src/main/resources/json_car.json"), Car.class);
            System.out.println("Car read from file: " + readCar);
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

class Car {
    private String color;
    private String type;

    public Car() {
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
