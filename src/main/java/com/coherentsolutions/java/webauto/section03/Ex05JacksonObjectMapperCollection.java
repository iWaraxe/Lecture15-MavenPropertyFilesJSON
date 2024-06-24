// File: Ex05JacksonObjectMapperCollection.java
package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.util.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;

/**
 * This class demonstrates reading a collection of JSON objects using Jackson ObjectMapper.
 */
public class Ex05JacksonObjectMapperCollection {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonCarArray = "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
        try {
            List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
            for (Car car : listCar) {
                System.out.println(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
