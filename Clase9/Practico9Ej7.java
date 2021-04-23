package Clase9;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej7 {

    @Test
    public void getWindowsSizeTest(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println("El largo actual es: " +height);
        System.out.println("El ancho actual es: " +width);

        Dimension dimension= new Dimension(760, 460);
        driver.manage().window().setSize(dimension);
        System.out.println("Actualizando el ancho y el largo");

        height=driver.manage().window().getSize().getHeight();
        width=driver.manage().window().getSize().getWidth();

        System.out.println("el largo actual es:"+ height);
        System.out.println("el ancho actual es:"+ width);

    }
    }
