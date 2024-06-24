// File: Ex01MavenBasicSetup.java
package com.coherentsolutions.java.webauto.section01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * This class demonstrates the basic setup of a Maven project and reading data from a .properties file.
 */
public class Ex01MavenBasicSetup {
    public static void main(String[] args) {
        // Load properties from app.properties file
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/app.properties"));
            String host = properties.getProperty("host","localhost");
            String port = properties.getProperty("port");
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
