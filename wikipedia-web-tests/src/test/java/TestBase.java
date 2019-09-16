<<<<<<< HEAD
import org.testng.annotations.*;
=======
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3

public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUP() {
<<<<<<< HEAD
        app.init();
=======
        app.wiki = new ChromeDriver();
        app.wiki.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.wiki.manage().window().maximize();
        app.wiki.get("https://en.wikipedia.org");
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
<<<<<<< HEAD
        app.stop();
=======
        Thread.sleep(5000);
        app.wiki.quit();
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
    }

}
