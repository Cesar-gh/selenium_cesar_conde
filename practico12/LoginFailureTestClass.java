package clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFailureTestClass {
public WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");

    }

    @Test(priority = 3)
    //Se crea metodo
    public void LoginFailureTestMethod(){
        //validar se encuentre logo
        WebElement e=driver.findElement(By.id("logo"));
        System.out.println("Etiqueta:"+e.getTagName());
        System.out.println("Atributo: "+e.getAttribute("alt"));
        System.out.println("TEXTX: "+e.getText());

        //completar campos
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("test@test.com");

        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("123466");

        //hacer clicl en loginLogin
        driver.findElement(By.id("Login")).click();

        WebElement elementError= driver.findElement(By.id("error"));
        System.out.println(elementError.getText());

        String expectedError="Your access to salesforce.com has been disabled by your system administrator. " +
                "Please contact your Administrator for more information.";
        Assert.assertEquals(expectedError, elementError.getText());
    }
}
