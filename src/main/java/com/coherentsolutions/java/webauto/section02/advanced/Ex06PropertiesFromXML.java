// File: Ex06PropertiesFromXML.java
package com.coherentsolutions.java.webauto.section02.advanced;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class demonstrates loading properties from an XML file.
 */
public class Ex06PropertiesFromXML {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.xml")) {
            properties.loadFromXML(fis);
            String host = properties.getProperty("host");
            String port = properties.getProperty("port");
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
