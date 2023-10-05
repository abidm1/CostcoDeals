import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.Set;


public class BaseClass {
    static WebDriver driver;

    void setup(String url) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get(url);
    }


}