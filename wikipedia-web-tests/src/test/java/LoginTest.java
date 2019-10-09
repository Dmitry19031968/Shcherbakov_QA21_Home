import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @Test
    public void loginTest() {


        //init login
        app.wiki.findElement(By.id("pt-login")).click();
        //fill login form
        app.wiki.findElement(By.id("wpName1")).click();
        app.wiki.findElement(By.id("wpName1")).clear();
        app.wiki.findElement(By.id("wpName1")).sendKeys("Shcherbakov190368@gmail.com");

        app.wiki.findElement(By.id("wpPassword1")).click();
        app.wiki.findElement(By.id("wpPassword1")).clear();
        app.wiki.findElement(By.id("wpPassword1")).sendKeys("wdw77wdw");

        //confirm login
        app.wiki.findElement(By.name("wploginattempt")).click();
    }



}