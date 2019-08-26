import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {


    WebDriver wiki;

    @BeforeMethod
    public void setUP() {
        wiki = new ChromeDriver();
        wiki.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wiki.manage().window().maximize();
        wiki.get("https://en.wikipedia.org");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        wiki.quit();
    }
}
