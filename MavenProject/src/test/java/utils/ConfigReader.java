package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            String path = System.getProperty("user.dir")
                    + "/src/test/resources/config.properties";
            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            System.out.println("config.properties not found: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
