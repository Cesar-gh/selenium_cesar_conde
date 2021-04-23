package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej10 {

    @Test
    public void searchIngoogle(){
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= getGoogleDriver();
        System.out.println("entra 1::");
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys(charSequences: "WebElement"+keys.ENTER);
    }
}
