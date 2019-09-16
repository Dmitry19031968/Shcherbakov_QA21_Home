
import org.testng.annotations.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUP() {

        app.init();

        app.wiki = new ChromeDriver();
        app.wiki.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.wiki.manage().window().maximize();
        app.wiki.get("https://en.wikipedia.org");

    }

    @AfterTest
    public void tearDown() throws InterruptedException {

        app.stop();

        Thread.sleep(5000);
        app.wiki.quit();

    }

}
