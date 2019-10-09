import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestBase {
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startLogger(Method m, Object[] p) {
        logger.info("start test " + m.getName() + " with parameters" + Arrays.asList(p));
    }

    @AfterMethod
    public void stopLogger(Method m){
        logger.info("stop test " + m.getName());
        System.out.println("=========================================================================================");
    }

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