// File: Ex01ReadPropertiesFile.java
package com.coherentsolutions.java.webauto.section02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * This class demonstrates reading properties from a file using the Properties class.
 */
public class Ex01ReadPropertiesFile {
    public static void main(String[] args) {
        // Load properties from app.properties file
        File file = new File("src/main/resources/app.properties");
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
            String email = properties.getProperty("email");
            System.out.println("Email: " + email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
