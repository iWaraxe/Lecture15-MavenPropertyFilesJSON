// File: Ex03LoadPropertiesViaInputStream.java
package com.coherentsolutions.java.webauto.section02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class demonstrates loading properties from a file using InputStream.
 */
public class Ex03LoadPropertiesViaInputStream {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream is = Ex03LoadPropertiesViaInputStream.class.getResourceAsStream("/app.properties")) {
            properties.load(is);
            String domain = properties.getProperty("domain");
            System.out.println("Domain: " + domain);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
