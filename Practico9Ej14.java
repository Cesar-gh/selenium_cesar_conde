package Clase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Practico9Ej14 {

    @Test
    public void metodoNetflix(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //acceder a netflix
        driver.get("https://www.netflix.com");

        //mostrar elementos h1 y h2
        List<WebElement> h1Elements=driver.findElements(By.tagName("h1"));
        List<WebElement> h2Elements=driver.findElements(By.tagName("h2"));
        System.out.println("***********   Elementos H1`s   ***************");
        for (WebElement h1count :h1Elements){
            System.out.println("Elemento H1: "+h1count.getText() );
        }
        System.out.println("\n***********   Elementos H2`s   ***************");
        for (WebElement h2count :h2Elements){
            System.out.println("Elemento H2: "+h2count.getText() );
        }

        //refrescar la pagina
        driver.navigate().refresh();

        //mostrar el texto de los botones que se encuentra en la pagina
        System.out.println("\n***********   Elementos BUTTON`s   ***************");
        List<WebElement> btnElements=driver.findElements(By.tagName("button"));
        for (WebElement btn: btnElements){
            System.out.println("nombre del button: "+btn.getText());
        }

        //Mostrar la cantidad de elementos div que contiene el sitio
        System.out.println("\n***********   Elementos DIV`s   ***************");
        List<WebElement> divElements=driver.findElements(By.tagName("div"));
        System.out.println("cantidad de elementos div's es: : "+ divElements.size());

        //obtener y mostrar el titulo de la pagina
        System.out.println("\n***********   TITULO DE LA PAGINA   ***************");
        System.out.println("El titulo d ela pagina es: "+driver.getTitle());

        //Mostrar la cantidad de elementos de tipos link
        System.out.println("\n***********   Elementos LINK`s   ***************");
        List<WebElement> linkElements=driver.findElements(By.tagName("button"));
        System.out.println("la cantidad de elementos LINK es: "+linkElements.size());
    }
}
