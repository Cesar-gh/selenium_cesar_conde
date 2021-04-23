package Clase9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej2 {
    @Test
    public void MostrarTituloTest(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");

    }
}
