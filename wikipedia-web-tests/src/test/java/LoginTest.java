import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    WebDriver wiki;

    @Test
    public void loginTest() {
        //init login
        wiki.findElement(By.id("pt-login")).click();
        //fill login form
        wiki.findElement(By.id("wpName1")).click();
        wiki.findElement(By.id("wpName1")).clear();
        wiki.findElement(By.id("wpName1")).sendKeys("qwertyuiop@gmail.com");

        wiki.findElement(By.id("wpPassword1")).click();
        wiki.findElement(By.id("wpPassword1")).clear();
        wiki.findElement(By.id("wpPassword1")).sendKeys("123456789Pp");

        //confirm login
        wiki.findElement(By.name("wploginattempt")).click();
    }

}