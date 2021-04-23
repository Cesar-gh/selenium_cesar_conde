package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticoEj11 {

    @Test
    public WebDriver searchInGoogleAndGoBack(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("El titulo es: "`+driver.getTitle());

        driver.findElement(By.name("q")).sendKeys(char);

    }
}
