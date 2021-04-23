package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Practico9Ej3 {


    @Test
    public void bbcMundTest(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");
        System.out.println("TITLE: "+driver.getTitle());

        List<WebElement> listah1s= driver.findElements(By.tagName("h1"));
        List<WebElement> listah2s= driver.findElements(By.tagName("h2"));

        for (WebElement h1:listah1s){
            System.out.println("---H1: "+h1.getText());
        }
        System.out.println("cantidad de H1 es: " +listah1s.size());
        System.out.println("-----------------------------------------------------------");

        System.out.println("cantidad de H2 es: " +listah2s.size());
        for (WebElement h2:listah2s){
            System.out.println("---H2: "+h2.getText());
        }

    }
}
