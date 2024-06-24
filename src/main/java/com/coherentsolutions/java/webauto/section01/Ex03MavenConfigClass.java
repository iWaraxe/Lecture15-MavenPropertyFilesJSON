// File: Ex03MavenConfigClass.java
package com.coherentsolutions.java.webauto.section01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class demonstrates encapsulating properties loading in a configuration class.
 */
public class Ex03MavenConfigClass {

    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream is = Ex03MavenConfigClass.class.getResourceAsStream("/app.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println("Domain: " + Ex03MavenConfigClass.getProperty("domain"));
    }
}
