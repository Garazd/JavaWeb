package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);

            System.out.println(properties.getProperty("database"));
            System.out.println(properties.getProperty("db.user"));
            System.out.println(properties.getProperty("db.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}