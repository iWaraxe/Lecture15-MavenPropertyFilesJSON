// File: Ex05AdvancedPropertiesUsage.java
package com.coherentsolutions.java.webauto.section02.advanced;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * This class demonstrates advanced usage of the Properties class including listing all properties.
 */
public class Ex05AdvancedPropertiesUsage {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/app.properties"));

            // Listing all properties
            Enumeration<?> enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()) {
                String key = (String) enumeration.nextElement();
                String value = properties.getProperty(key);
                System.out.println(key + ": " + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
