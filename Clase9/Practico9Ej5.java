package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Practico9Ej5 {

    @Test
    public void bbcMundTest(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listas= driver.findElements(By.tagName("li"));

        for (WebElement li:listas){
            System.out.println("Li: "+li.getText());
        }
    }
}
