package Clase9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej9 {

    @Test
    public WebDriver getDriver(String URL){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("entra 1::");
        driver.get(URL);
        return driver;

    }
}
