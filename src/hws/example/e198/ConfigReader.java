package hws.example.e198;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }
    public String getUrl() {
        return properties.getProperty("url");
    }

    public int getImplicitWait() {
        return Integer.parseInt(properties.getProperty("implicitWait"));
    }
    public class Main {
        public static void main(String[] args) {
            ConfigReader configReader = new ConfigReader();
            System.out.println("Browser: " + configReader.getBrowser());
            System.out.println("URL: " + configReader.getUrl());
            System.out.println("Implicit Wait: " + configReader.getImplicitWait());
        }

        public class SeleniumTest {
            public static void main(String[] args) {
                ConfigReader configReader = new ConfigReader();
                String browser = configReader.getBrowser();
                String url = configReader.getUrl();
                int implicitWait = configReader.getImplicitWait();
            }

        }
    }
}