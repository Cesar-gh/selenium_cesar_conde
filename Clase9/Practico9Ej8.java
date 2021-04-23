package Clase9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej8 {

    @Test
    public WebDriver  getGoogleDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("xxxxxxxxxxxxxxxx");
        driver.get("https://www.google.com");
        System.out.println("obj: "+driver.getTitle());
        System.out.println("yyyyyyyyyy");

        return driver;

    }
}
