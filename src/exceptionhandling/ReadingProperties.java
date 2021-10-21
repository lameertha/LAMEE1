package exceptionhandling;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Jay Vaghani on 28-Sep-2019
 */
public class ReadingProperties {

    public static void main(String[] args) {
        String path ="C:\\JavaPractice\\java-practice\\src\\exceptionhandling\\test.properties";

        Properties prop = new Properties();

        try {
            FileInputStream fs = new FileInputStream(path);
            prop.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));


    }
}
