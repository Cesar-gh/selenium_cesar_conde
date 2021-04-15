import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PrimerTest {



    @Test
    public void buscarGoogle(){

        System.out.println( "Hello World ENTROO!" );
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        System.out.println("se escog TITLE:"+ driver.getTitle());

        System.out.println("este es el numero de resultados");


    }


}
