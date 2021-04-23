package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej11 {

    @Test
    public void searchInGoogleAndGoBack(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("El titulo es: "+driver.getTitle());
        WebElement searching=driver.findElement(By.name("q"));
        searching.sendKeys("WebElement"+ Keys.ENTER);


    }
}
