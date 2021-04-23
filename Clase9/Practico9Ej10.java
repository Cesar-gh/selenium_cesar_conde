package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej10 {

    @Test
    public void searchIngoogle(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        System.out.println("entra 1::");
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("cesar   "+ Keys.ENTER);
        //WebElement searchBox = driver.findElement(By.name("q"));
        //driver.findElement(By.name("q")).sendKeys(charSequences: "WebElement"+keys.ENTER);
    }
}
