package Clase9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practico9Ej6 {
    @Test
    public void spotifTitleTes(){
        System.out.println("entra 1:");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.spotify.com");

        String title= driver.getTitle();

        if (title.equals("Escuchar es todo - Spotify")){
            System.out.println("Test passed");
        }else {
            System.out.println(title);
            System.out.println("Test failed");
        }



    }
}
