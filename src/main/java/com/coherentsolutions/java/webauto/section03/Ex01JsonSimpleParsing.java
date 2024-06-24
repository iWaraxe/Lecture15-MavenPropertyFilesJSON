// File: Ex01JsonSimpleParsing.java
package com.coherentsolutions.java.webauto.section03;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This class demonstrates parsing JSON data using json-simple library.
 */
public class Ex01JsonSimpleParsing {
    public static void main(String[] args) {
        JSONObject jsonObject = null;
        try {
            FileReader reader = new FileReader("./src/main/resources/app.json");
            JSONParser parser = new JSONParser();
            jsonObject = (JSONObject) parser.parse(reader);
            System.out.println("Value from JSON file: " + jsonObject.get("name"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}
