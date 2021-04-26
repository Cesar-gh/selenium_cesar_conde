package clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    //se crea metodo
    @Test
    public void  fullRegistrationTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //se entra a facebook
        driver.get("https://www.facebook.com");

       // driver.findElement(By.xpath("//*[@ajaxify='/reg/spotlight/']")).click();
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(2000);

        //completar los campos de registro

        //*[@placeholder="Nombre"]
        //*[@name='name']"
        //driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("XXX");
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("“123456789”");
        //driver.findElement(By.name("reg_passwd__")).sendKeys("“123456789”");
        //driver.findElement(By.id("password_step_input")).sendKeys("“123456789”");

        WebElement dayElement=driver.findElement(By.id("day"));
        WebElement monthElement=driver.findElement(By.id("month"));
        WebElement yearElement=driver.findElement(By.id("year"));

        Select daysSelect=new Select(dayElement);
        Select monthSelect=new Select(monthElement);
        Select yearSelect=new Select(yearElement);

        daysSelect.selectByIndex(26);
        monthSelect.selectByVisibleText("jun");
        yearSelect.selectByValue("1980");

        List<WebElement> listaSex=driver.findElements(By.name("sex"));
        Assert.assertEquals(listaSex.size(),3);

        WebElement maleElement=listaSex.get(1);
        maleElement.click();
    }
}
