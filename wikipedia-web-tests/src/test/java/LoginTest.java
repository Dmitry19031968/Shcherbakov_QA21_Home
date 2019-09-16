import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


<<<<<<< HEAD
=======

>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
    @Test
    public void loginTest() {
        //init login
        app.wiki.findElement(By.id("pt-login")).click();
        //fill login form
        app.wiki.findElement(By.id("wpName1")).click();
        app.wiki.findElement(By.id("wpName1")).clear();
        app.wiki.findElement(By.id("wpName1")).sendKeys("qwertyuiop@gmail.com");

        app.wiki.findElement(By.id("wpPassword1")).click();
        app.wiki.findElement(By.id("wpPassword1")).clear();
        app.wiki.findElement(By.id("wpPassword1")).sendKeys("123456789Pp");

        //confirm login
        app.wiki.findElement(By.name("wploginattempt")).click();
    }

}