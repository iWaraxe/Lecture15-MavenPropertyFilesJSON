// File: Ex02MavenAdvancedSetup.java
package com.coherentsolutions.java.webauto.section01.advanced;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class demonstrates loading properties using InputStream.
 */
public class Ex02MavenAdvancedSetup {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream is = Ex02MavenAdvancedSetup.class.getResourceAsStream("/app.properties")) {
            properties.load(is);
            String email = properties.getProperty("email");
            System.out.println("Email: " + email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
