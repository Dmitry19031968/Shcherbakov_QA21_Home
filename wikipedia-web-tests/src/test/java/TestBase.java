
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestBase {


    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUP() {

        app.init();

       app.wiki = new ChromeDriver();
       app.wiki.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       app.wiki.manage().window().maximize();
       app.wiki.get("https://en.wikipedia.org");

    }

    @AfterSuite
    public void tearDown() throws InterruptedException {

        //app.stop();

        Thread.sleep(5000);
        app.wiki.quit();

    }

}
