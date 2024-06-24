// File: Ex02PropertiesMethods.java
package com.coherentsolutions.java.webauto.section02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * This class demonstrates different methods of the Properties class.
 */
public class Ex02PropertiesMethods {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(new File("src/main/resources/app.properties")));

            // Using getProperty method
            String host = properties.getProperty("host");
            String port = properties.getProperty("port");
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);

            // Using stringPropertyNames method
            Set<String> propertyNames = properties.stringPropertyNames();
            for (String propertyName : propertyNames) {
                System.out.println(propertyName + ": " + properties.getProperty(propertyName));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
