package Clase9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej1 {

    @Test
    public void Ej1(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("TITLE: "+driver.getTitle());
    }
}
